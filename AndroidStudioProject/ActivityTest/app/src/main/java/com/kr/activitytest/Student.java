package com.kr.activitytest;

import java.io.Serializable;

public class Student implements Serializable {
    private String name = "aaa";
    private int id = 222;
    private int age = 33;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
