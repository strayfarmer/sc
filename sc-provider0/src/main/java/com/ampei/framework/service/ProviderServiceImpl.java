package com.ampei.framework.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pam
 * @version 1.0
 * @description
 * @date 9/5/2022 1:23 PM
 */
@RestController
@RequestMapping("/home")
public class ProviderServiceImpl {

    @Autowired
    private ServletWebServerApplicationContext context;
    
    @RequestMapping("/sayHello")
    public String sayhello(@RequestParam(value = "name") String name){
        System.out.println("I`m provider 0 ,Hello "+name+"! port->"+context.getWebServer().getPort());
        return "I`m provider 0 ,Hello "+name+"! port->"+context.getWebServer().getPort();
    }

}
