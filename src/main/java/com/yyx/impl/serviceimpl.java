package com.yyx.impl;

import com.yyx.mapper.UserMapper;
import com.yyx.pojo.Person;
import com.yyx.service.service;

public class serviceimpl implements service {
    private UserMapper userMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public Person LoginService(String name, Integer age) {
        Person person = userMapper.LoginMapper(name,age);

        return person;
    }
}
