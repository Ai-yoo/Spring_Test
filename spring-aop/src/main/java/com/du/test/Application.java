package com.du.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IDEA
 *
 * @author duzhentong
 * @Date 2018/5/30
 * @Time 21:39
 */
@Configuration
@ComponentScan
public class Application {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
        TestBean tb = (TestBean)ap.getBean("test");
        tb.test();
    }
}
