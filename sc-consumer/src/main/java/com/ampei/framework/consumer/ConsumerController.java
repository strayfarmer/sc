package com.ampei.framework.consumer;

import com.ampei.framework.service.ProviderService;
import com.ampei.framework.service.UserService;
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
    @Resource
    private UserService userService;

    @RequestMapping("/hello")
    public String hello(@RequestParam String name){
        return providerService.sayhello(name);
    }

    @RequestMapping("/user")
    public String findByName(@RequestParam String name){
        return userService.findByName(name);
    }
}
