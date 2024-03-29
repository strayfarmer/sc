package com.ampei.framework.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author pam
 * @version 1.0
 * @description
 * @date 9/5/2022 1:23 PM
 */
@FeignClient(value = "provider0", contextId = "ProviderService")
public interface ProviderService {

    @RequestMapping("/home/sayHello")
    String sayhello(@RequestParam(value = "name") String name);

}
