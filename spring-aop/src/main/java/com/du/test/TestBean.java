package com.du.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created with IDEA
 *
 * @author duzhentong
 * @Date 2018/5/30
 * @Time 21:29
 */


public class TestBean {
    private String str = "测试";

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void test() {
        System.out.println("test");
    }

    @Autowired
    public TestBean() {

    }
}
