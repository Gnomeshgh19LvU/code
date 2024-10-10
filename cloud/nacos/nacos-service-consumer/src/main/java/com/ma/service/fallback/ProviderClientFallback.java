package com.ma.service.fallback;

import com.ma.pojo.User;
import com.ma.service.ProviderClient;

public class ProviderClientFallback implements ProviderClient {

    User user = new User();

    @Override
    public User getUser(Integer id) {
        user.setUsername("Fallback返回的信息");
        return user;
    }

    @Override
    public User postUser(User user) {
        user.setUsername("Fallback返回的信息");
        return user;
    }
}
