package com.ampei.framework.controller;

import com.ampei.framework.service.ProviderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author pam
 * @version 1.0
 * @description
 * @date 9/5/2022 1:23 PM
 */
@Slf4j
@RestController
@RequestMapping("/home")
public class ConsumerController {

    @Resource
    private ProviderService providerService;

    @RequestMapping("/hello")
    public String hello(@RequestParam String name){
        return providerService.sayhello(name);
    }
}
