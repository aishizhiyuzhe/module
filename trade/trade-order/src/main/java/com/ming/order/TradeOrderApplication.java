package com.ming.order;

import com.alibaba.nacos.spring.context.annotation.discovery.EnableNacosDiscovery;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TradeOrderApplication{
    public static void main(String[] args) {
        SpringApplication.run(TradeOrderApplication.class,args);
    }
}
