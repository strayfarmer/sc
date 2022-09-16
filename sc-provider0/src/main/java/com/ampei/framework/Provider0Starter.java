package com.ampei.framework;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author pam
 * @version 1.0
 * @description
 * @date 9/5/2022 10:17 AM
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@MapperScan("com.ampei.framework.mapper")
public class Provider0Starter {

    public static void main(String[] args) {
        SpringApplication.run(Provider0Starter.class, args);
    }

}
