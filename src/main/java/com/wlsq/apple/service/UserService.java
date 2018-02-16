package com.wlsq.apple.service;

import com.wlsq.apple.entity.User;
import com.wlsq.apple.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUsers(){
        return userMapper.getAllUsers();
    }
}
