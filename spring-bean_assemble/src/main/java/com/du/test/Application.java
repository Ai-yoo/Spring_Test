package com.du.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IDEA
 *
 * 基于xml的装配
 *
 * @author duzhentong
 * @Date 2018/6/4
 * @Time 8:39
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println(ac.getBean("user1"));
        System.out.println(ac.getBean("user2"));
        System.out.println(ac.getBean("user3"));
        System.out.println(ac.getBean("user4"));
        System.out.println(ac.getBean("user5"));
    }
}
