package com.ma.service;

import com.ma.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-provider")
public interface ProviderService {
    @GetMapping("/api/v1/provider/getUser")
    User getUser(@RequestParam("id") Integer id);

    @PostMapping("/api/v1/provider/postUser")
    User postUser(@RequestBody User user);
}
