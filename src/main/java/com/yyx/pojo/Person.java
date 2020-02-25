package com.yyx.pojo;

import java.util.Arrays;
import java.util.List;

public class Person {
    private Integer id;
    private String name;
    private Integer age;
    private Integer tid;
    private Teacher teacher;

    private List<String> list;
    private String[] array;

    public List<String> getList() {
        return list;
    }

    public Person(Integer id, String name, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", tid=" + tid +
                ", teacher=" + teacher +
                ", list=" + list +
                ", array=" + Arrays.toString(array) +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Person() {
    }

    public Person(Integer id, String name, Integer age, Integer tid, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.tid = tid;
        this.teacher = teacher;
    }
}
