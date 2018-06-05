package com.du.test.static_factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IDEA
 *
 * 静态工厂实例化
 *
 * @author duzhentong
 * @Date 2018/6/5
 * @Time 15:15
 */
public class InstanceTest2 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring2.xml");
        TestBean2 bean2 = (TestBean2) ac.getBean("bean2");
        System.out.println(bean2);
    }
}
