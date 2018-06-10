package com.du.test2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author duzhentong
 * @Date 2018/6/9
 * @Time 10:27
 */
public class JdbcTemplateTest {

    @Test
    public void addUserTest() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring2.xml");
        UserDao userDao = (UserDao) ac.getBean("userDao");
        User user = new User();
        user.setId(4);
        user.setUsername("bill");
        int num = userDao.addUser(user);
        if (num > 0) {
            System.out.println("成功插入数据");
        } else {
            System.out.println("插入失败");
        }
    }

    @Test
    public void updateUser() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring2.xml");
        UserDao userDao = (UserDao) ac.getBean("userDao");
        User user = new User();
        user.setId(1);
        user.setUsername("Alice");
        int num = userDao.updateUser(user);
        if (num > 0) {
            System.out.println("成功更新数据");
        } else {
            System.out.println("更新失败");
        }
    }

    @Test
    public void deleteUser() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring2.xml");
        UserDao userDao = (UserDao) ac.getBean("userDao");
        int num = userDao.deleteUser(2);
        if (num > 0) {
            System.out.println("成功删除数据");
        } else {
            System.out.println("删除失败");
        }
    }

    @Test
    public void findUserById() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring2.xml");
        UserDao userDao = (UserDao) ac.getBean("userDao");
        User user = userDao.findUserById(3);
        System.out.println(user);
    }

    @Test
    public void findAllUser() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring2.xml");
        UserDao userDao = (UserDao) ac.getBean("userDao");
        List<User> list = userDao.findAllUser();
        for (User user : list) {
            System.out.println(user);
        }
    }
}
