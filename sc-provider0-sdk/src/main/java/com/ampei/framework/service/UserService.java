package com.ampei.framework.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ampei
 * @since 2022-09-14
 */
@FeignClient(value = "provider0", contextId = "UserService")
public interface UserService {

    @RequestMapping("/home/sayHello")
    String sayhello(@RequestParam(value = "name") String name);

}
