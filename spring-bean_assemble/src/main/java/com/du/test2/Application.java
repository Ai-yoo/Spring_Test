package com.du.test2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IDEA
 *
 * 根据配置文件和注解实现bean的自动装配
 *
 * @author duzhentong
 * @Date 2018/6/4
 * @Time 10:58
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring2.xml");
        User user1 = (User)ac.getBean("user1");
        User user2 = (User)ac.getBean("user2");
        User user3 = (User)ac.getBean("user3");
        User user4 = (User)ac.getBean("user4");
        user1.say();
        user2.say();
        user3.say();
        user4.say();
//        System.out.println(ac.getBean("user1"));
//        System.out.println(ac.getBean("user2"));
//        System.out.println(ac.getBean("user3"));
    }
}
