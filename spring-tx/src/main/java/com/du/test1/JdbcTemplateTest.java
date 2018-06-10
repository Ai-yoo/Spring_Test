package com.du.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 * Created with IDEA
 *
 * 基于注解的声明式事务管理
 *
 * @author duzhentong
 * @Date 2018/6/9
 * @Time 10:05
 */
public class JdbcTemplateTest {
    @Test
    public void annotationTest() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring1.xml");
        UserDao userDao = (UserDao) ac.getBean("userDao");
        userDao.transfer(1, 2, 50);
        System.out.println("操作成功!");
    }
}
