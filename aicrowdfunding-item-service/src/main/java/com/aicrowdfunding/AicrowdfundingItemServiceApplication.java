package com.aicrowdfunding;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan({"com.aicrowdfunding.aicrowdfundingitemservice.mapper"})
@EnableDubbo
@SpringBootApplication
public class AicrowdfundingItemServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AicrowdfundingItemServiceApplication.class, args);
    }

}
