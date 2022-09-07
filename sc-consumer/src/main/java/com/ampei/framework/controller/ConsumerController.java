package com.ampei.framework.controller;

import com.ampei.framework.service.inter.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class ConsumerController {

    @Autowired
    private ProviderService providerService;

    @RequestMapping("/hello")
    public String hello(@RequestParam String name){
        return providerService.sayhello(name);
    }
}
