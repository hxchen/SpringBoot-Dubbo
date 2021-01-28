package com.a3fun.provider.service.impl;

import com.a3fun.entity.User;
import com.a3fun.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service()
public class UserServiceImpl implements UserService {
    @Override
    public User getUserById(long id) {
        User user = new User();
        user.setName("test");
        user.setId(id);
        return user;
    }
}
