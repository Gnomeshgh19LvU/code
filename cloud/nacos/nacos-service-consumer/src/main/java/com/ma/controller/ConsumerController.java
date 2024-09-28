package com.ma.controller;

import com.ma.pojo.User;
import com.ma.service.ProviderClient;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/v1/consumer")
public class ConsumerController {


    private final RestTemplate restTemplate;
    private final DiscoveryClient discoveryClient;
    private final ProviderClient providerClient;

    public ConsumerController(RestTemplate restTemplate, DiscoveryClient discoveryClient, ProviderClient providerClient) {
        this.restTemplate = restTemplate;
        this.discoveryClient = discoveryClient;
        this.providerClient = providerClient;
    }


    /**
     * 硬编码 URL 的方法
     *
     * @return
     */
//    http://localhost:2000/api/v1/consumer/info/static
    @GetMapping("/info/static")
    public String staticInfo() {
        // 使用 RestTemplate 调用 provider-service 的接口
        String url = "http://service-provider/api/v1/provider/info";
        return restTemplate.getForObject(url, String.class);
    }


    /**
     * String url = "http://provider-service/api/v1/provider/info";
     * 缺点：url路径写死，想要他动态获取
     * 动态获取 URL 的方法
     * 使用 discoveryClient
     *
     * @return
     */
//    http://localhost:2000/api/v1/consumer/info/dynamic
    @GetMapping("/info/dynamic")
    public String dynamicInfo() {
        // 使用 RestTemplate 直接调用 provider-service 的接口
        List<ServiceInstance> list = discoveryClient.getInstances("service-provider");
        ServiceInstance serviceInstance = list.get(0);
        return restTemplate.getForObject("http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/api/v1/provider/info", String.class);
        /**
         * 其实也是字符串拼接的过程
         * 以上的路径是等于 "http://provider-service/api/v1/provider/info"
         */
    }


    /**
     * 使用fegin进行远程调用
     * Get请求方法
     * @param id
     * @return
     */
//    http://localhost:2000/api/v1/consumer/getUser?id=1
    @GetMapping("/getUser")
    public User getUser(@RequestParam Integer id) {
        return providerClient.getUser(id);
    }


    /**
     * 使用fegin进行远程调用
     * Post请求方法
     * @param user
     * @return
     */
//    http://localhost:2000/api/v1/consumer/postUser
    @PostMapping("/postUser")
    public User postUser(@RequestBody User user) {
        return providerClient.postUser(user);
    }

}