package com.a3fun.service;

import com.a3fun.entity.User;

/**
 * @author haixiangchen
 */
public interface UserService {
    /**
     * 通过ID获取User
     * @param id
     * @return
     */
    User getUserById(long id);

}
