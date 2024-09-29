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


//    int temp = 0;
//
//    /**
//     *
//     * @param request
//     * @return
//     */
////    http://localhost:3000/api/v1/sentinel/list
//    @GetMapping("/list")
//    public Object list(HttpServletRequest request) {
//        // 延迟三秒展示对象信息模拟高并发
////        try {
////            TimeUnit.SECONDS.sleep(3);
////        } catch (InterruptedException e) {
////            throw new RuntimeException(e);
////        }
//        temp++;
//        if (temp % 3 == 0) {
//            throw new RuntimeException();
//        }
//        Map<String, String> map = new HashMap<>();
//        map.put("title-1", "sentinel-1");
//        map.put("title-2", "sentinel-2");
//        map.put("port", request.getServerPort() + "");
//        return map;
//    }


}
