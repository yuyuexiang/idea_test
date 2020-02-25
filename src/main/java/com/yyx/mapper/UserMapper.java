package com.yyx.mapper;

import com.yyx.pojo.Person;

public interface UserMapper {
    //登录
    public Person LoginMapper(String name,Integer age);

}
