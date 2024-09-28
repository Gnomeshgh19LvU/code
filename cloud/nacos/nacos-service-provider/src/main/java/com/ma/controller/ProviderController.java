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


    @GetMapping("/info")
    public String getInfo() {
        return "provider-service";
    }

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
