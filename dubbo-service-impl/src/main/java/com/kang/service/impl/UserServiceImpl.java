package com.kang.service.impl;

import com.kang.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by kang on 16-5-31.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    public String getUserName() {

        System.out.println("===============");
        return "kang";
    }
}
