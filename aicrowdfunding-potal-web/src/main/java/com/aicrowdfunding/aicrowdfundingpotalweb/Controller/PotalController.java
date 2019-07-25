package com.aicrowdfunding.aicrowdfundingpotalweb.Controller;

import com.aicrowdfunding.service.Test;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PotalController {

    @Reference
    private Test test;

    @RequestMapping("index")
    public String toIndex() {
        return "index";
    }
}
