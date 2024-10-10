package com.ma.service;

import com.ma.pojo.User;
import com.ma.service.fallback.ProviderClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 标记一个接口为Feign客户端，并指定要调用的远程服务的名称
 */
@FeignClient(value = "service-provider",fallback = ProviderClientFallback.class)
public interface ProviderClient {

    @GetMapping("/api/v1/provider/getUser")
    User getUser(@RequestParam("id") Integer id);

    @PostMapping("/api/v1/provider/postUser")
    User postUser(@RequestBody User user);

}

