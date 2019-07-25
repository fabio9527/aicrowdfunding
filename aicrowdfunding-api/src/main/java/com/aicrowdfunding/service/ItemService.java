package com.aicrowdfunding.service;

import com.aicrowdfunding.bean.TProject;
import com.aicrowdfunding.bean.TReturn;
import com.aicrowdfunding.bean.vo.Item;

import java.util.List;


public interface ItemService {

    TProject getProject(int id);

    List<TReturn> getTreturn(int id);

    Item getItem(int id);

}
