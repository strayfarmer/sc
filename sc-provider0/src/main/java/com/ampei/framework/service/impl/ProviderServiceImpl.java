package com.ampei.framework.service.impl;

import com.ampei.framework.service.ProviderService;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@RestController
@RequestMapping("/home")
public class ProviderServiceImpl implements ProviderService {

    @Autowired
    private ServletWebServerApplicationContext context;
    
    @RequestMapping("/sayHello")
    public String sayhello(@RequestParam(value = "name") String name){
        log.info("I`m provider 0 ,Hello {}! port->{}", name, context.getWebServer().getPort());
        return "I`m provider 0 ,Hello "+name+"! port->"+context.getWebServer().getPort();
    }

}
