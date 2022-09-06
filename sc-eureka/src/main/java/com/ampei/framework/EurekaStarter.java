package com.ampei.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author pam
 * @version 1.0
 * @description
 * @date 9/5/2022 10:17 AM
 */
@SpringBootApplication(exclude= SecurityAutoConfiguration.class)
@EnableEurekaServer
public class EurekaStarter {

    public static void main(String[] args) {
        SpringApplication.run(EurekaStarter.class, args);
        System.out.println("---服务监控访问地址"+"http://localhost:8761");
    }

}
