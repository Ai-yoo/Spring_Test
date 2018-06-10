package com.du.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created with IDEA
 *
 * @author duzhentong
 * @Date 2018/6/9
 * @Time 10:05
 */
public class JdbcTemplateTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring1.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) ac.getBean("jdbcTemplate");
        jdbcTemplate.execute("create table users(id int(5) primary key ,name varchar(10))");
    }
}
