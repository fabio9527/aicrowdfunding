package com.aicrowdfunding.aicrowdfundingitemservice.service.impl;

import com.aicrowdfunding.aicrowdfundingitemservice.mapper.ItemMapper;
import com.aicrowdfunding.bean.TProject;
import com.aicrowdfunding.bean.TReturn;
import com.aicrowdfunding.bean.vo.Item;
import com.aicrowdfunding.commonUtil.StringUtil;
import com.aicrowdfunding.service.ItemService;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class ItemServiceImpl implements ItemService {

//    @Autowired
//    private TProjectMapper tProjectMapper;
//    @Autowired
//    private TReturnMapper tReturnMapper;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private ItemMapper itemMapper;

//    @Override
//    public TProject getProject(int id) {
//        TProject tProject = tProjectMapper.selectByPrimaryKey(id);
//        return tProject;
//    }
//
//    @Override
//    public List<TReturn> getTreturn(int id) {
//        TReturnExample tReturnExample=new TReturnExample();
//        TReturnExample.Criteria tReturnExampleCriteria = tReturnExample.createCriteria();
//        tReturnExampleCriteria.andIdEqualTo(id);
//        List<TReturn> tReturns=tReturnMapper.selectByExample(tReturnExample);
//        return tReturns;
//    }

    @Override
    public TProject getProject(int id) {
        return null;
    }

    @Override
    public List<TReturn> getTreturn(int id) {
        return null;
    }

    @Override
    public Item getItem(int id) {

        Item item=null;
        String jsonItemString=null;
        String redisItemKey="item:"+id;
        String redisItemValue = stringRedisTemplate.opsForValue().get(redisItemKey);

        /*如果redis中不存在，则从数据库中查找，但是为了防止缓存击穿，使用分布式锁，使得当前只有一个请求能够访问数据库，
        * 其他的请求进行自旋请求redis
        * 且存入redis中
        */
        if(StringUtil.isEmpty(redisItemValue)){
            String itemLockKey="itemLock";
            Date currentTime=new Date();
            Boolean setIfAbsent = stringRedisTemplate.opsForValue().setIfAbsent(itemLockKey, String.valueOf(currentTime.getTime()), 3, TimeUnit.SECONDS);
            //如果锁设置成功，就从数据库中查询，然后设置到缓存中
            if(setIfAbsent){
                item = itemMapper.selectItemById(id);
                //如果数据库中也没有，设置缓存value为null,防止缓存穿透
                if(item!=null){
                    jsonItemString = JSON.toJSONString(item);
                    stringRedisTemplate.opsForValue().set(redisItemKey,jsonItemString,60*60*24, TimeUnit.SECONDS);
                }else
                    stringRedisTemplate.opsForValue().set(redisItemKey,null,60*60*24, TimeUnit.SECONDS);
            }else {
                //如果锁设置失败，就去redis中查询自旋
                while(!setIfAbsent && StringUtil.isEmpty(jsonItemString)){
                    jsonItemString=stringRedisTemplate.opsForValue().get(redisItemKey);
                }
            }
        }else {
            //如果redis中存在，则直接将json转化成Item对象返回
            item = JSON.parseObject(redisItemValue, Item.class);
        }
        return item;
    }


}
