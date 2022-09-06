package com.ampei.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author pam
 * @version 1.0
 * @description
 * @date 9/5/2022 10:17 AM
 */
@SpringBootApplication
@EnableEurekaClient
public class ConsumerStarter {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerStarter.class, args);
    }

}
