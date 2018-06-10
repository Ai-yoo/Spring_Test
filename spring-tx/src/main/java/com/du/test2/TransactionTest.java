package com.du.test2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 * Created with IDEA
 *
 * 基于xml的声明式事务
 *
 * @author duzhentong
 * @Date 2018/6/10
 * @Time 11:13
 */
public class TransactionTest {

    @Test
    public void xmlTest() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring2.xml");
        UserDao userDao = (UserDao) ac.getBean("userDao");
        userDao.transfer(1, 2, 50);
        System.out.println("操作成功!");
    }
}
