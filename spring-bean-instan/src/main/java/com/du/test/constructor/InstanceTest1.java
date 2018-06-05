package com.du.test.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IDEA
 *
 * 构造方法实例化
 *
 * @author duzhentong
 * @Date 2018/6/5
 * @Time 15:11
 */
public class InstanceTest1 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring1.xml");
        TestBean1 beann1 = (TestBean1) ac.getBean("bean1");
        System.out.println(beann1);
    }
}
