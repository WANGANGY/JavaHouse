package com.example.dubboserviceprovider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class DubboServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboServiceProviderApplication.class, args);
    }

}