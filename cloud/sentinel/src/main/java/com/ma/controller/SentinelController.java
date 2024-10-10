package com.ma.controller;

import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.Tracer;
import com.ma.pojo.User;
import com.ma.service.ProviderClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/sentinel")
public class SentinelController {

    private final ProviderClient providerService;

    public SentinelController(ProviderClient providerService) {
        this.providerService = providerService;
    }

    /**
     * 使用fegin调用Provider提供的User信息
     * 分别使用sentinel的-> 流量控制  熔断降级  热点参数限流  系统负载保护
     * 对接口进行限流
     *
     * @param id
     * @return
     */
//    http://localhost:3000/api/v1/sentinel/getUser?id=1
    @GetMapping("/getUser")
    public User getUser(@RequestParam Integer id)  {
        return providerService.getUser(id);
    }




}
