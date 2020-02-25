package com.yyx.test;

import com.yyx.pojo.Person;
import com.yyx.service.service;
import com.yyx.impl.serviceimpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        //获取spring容器对象：代码执行完spring容器中已经根据配置文件加载了相关bean对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationcontext.xml");
        service us = (serviceimpl) ac.getBean("us");
        Person person = us.LoginService("小明", 10);
        System.out.println(person);

    }
}
