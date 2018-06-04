package com.du.test;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IDEA
 *
 * @author duzhentong
 * @Date 2018/6/4
 * @Time 8:18
 */
public class User {
    private int id;
    private String name;

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
