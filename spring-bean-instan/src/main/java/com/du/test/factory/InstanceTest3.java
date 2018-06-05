package com.du.test.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IDEA
 *
 * 实例工厂实例化
 *
 * @author duzhentong
 * @Date 2018/6/5
 * @Time 15:22
 */
public class InstanceTest3 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring3.xml");
        TestBean3 bean3 = (TestBean3) ac.getBean("bean3");
        System.out.println(bean3);
    }
}
