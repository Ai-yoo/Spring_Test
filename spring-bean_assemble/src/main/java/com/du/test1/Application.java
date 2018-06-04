package com.du.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IDEA
 *
 * 基于注解装配bean，可配置自动扫描和手动配置每个bean
 *
 * @author duzhentong
 * @Date 2018/6/4
 * @Time 16:51
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring1.xml");
        UserController userController = (UserController) ac.getBean("userController");
        userController.run();

    }
}
