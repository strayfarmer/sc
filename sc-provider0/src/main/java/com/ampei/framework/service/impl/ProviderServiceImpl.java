package com.ampei.framework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pam
 * @version 1.0
 * @description
 * @date 9/5/2022 1:23 PM
 */
@FeignClient(value = "provider0")
public interface ProviderServiceImpl {

    @RequestMapping("/home/sayHello")
    String sayhello(@RequestParam(value = "name") String name);

}
