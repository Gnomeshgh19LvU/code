package com.ma.controller;


import com.ma.pojo.User;
import com.ma.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/provider")
public class ProviderController {

    private final UserService userService;

    public ProviderController(UserService userService) {
        this.userService = userService;
    }


//    http://localhost:1000/api/v1/provider/info
    @GetMapping("/info")
    public String getInfo() {
        return "provider-service";
    }

//    http://localhost:1000/api/v1/provider/getUser?id=1
    @GetMapping("/getUser")
    public User getUser(@RequestParam Integer id) {
        return userService.getById(id);
    }

    @PostMapping("postUser")
    public User postUser(@RequestBody User user) {
        userService.saveOrUpdate(user);
        return user;
    }
}
