package com.du.test1.entity;

/**
 * Created with IDEA
 *
 * @author duzhentong
 * @Date 2018/6/15
 * @Time 16:34
 */
public class User {

    private int id;
    private String username;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
