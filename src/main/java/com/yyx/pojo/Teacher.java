package com.yyx.pojo;

import java.util.List;

public class Teacher {
    private Integer tid;
    private String tname;
    private Integer tage;
    private List<Person> listperson;

    public Integer getTid() {
        return tid;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", tage=" + tage +
                ", listperson=" + listperson +
                '}';
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Integer getTage() {
        return tage;
    }

    public void setTage(Integer tage) {
        this.tage = tage;
    }

    public List<Person> getListperson() {
        return listperson;
    }

    public void setListperson(List<Person> listperson) {
        this.listperson = listperson;
    }

    public Teacher(Integer tid, String tname, Integer tage, List<Person> listperson) {
        this.tid = tid;
        this.tname = tname;
        this.tage = tage;
        this.listperson = listperson;
    }

    public Teacher() {
    }
}
