package com.du.test1;

import com.du.test1.entity.User;
import com.du.test1.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IDEA
 *
 * spring-mybatis整合
 *
 * @author duzhentong
 * @Date 2018/6/15
 * @Time 16:57
 */

public class UserTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService= ac.getBean(UserService.class);
        User user=userService.findUserByID(1);
        System.out.println(user);
    }
}
