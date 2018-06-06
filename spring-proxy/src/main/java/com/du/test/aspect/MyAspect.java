package com.du.test.aspect;

/**
 * Created with IDEA
 *
 * @author duzhentong
 * @Date 2018/6/6
 * @Time 19:04
 */
public class MyAspect {
    public void check_User() {
        System.out.println("检查用户权限");
    }

    public void log() {
        System.out.println("登录日志");
    }
}
