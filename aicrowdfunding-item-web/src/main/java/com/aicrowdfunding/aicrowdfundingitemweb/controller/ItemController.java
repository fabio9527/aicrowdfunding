package com.aicrowdfunding.aicrowdfundingitemweb.controller;

import com.aicrowdfunding.bean.vo.Item;
import com.aicrowdfunding.service.ItemService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/item")
@Controller
public class ItemController {

    @Reference
    private ItemService itemService;

    @GetMapping("/{id}")
    public ModelAndView toItem(@PathVariable("id") int id){
        ModelAndView mv=new ModelAndView();
        Item item=itemService.getItem(id);
        mv.addObject("item",item);
        mv.setViewName("item");
        return mv;
    }

}
