package com.du.test1.service.impl;

import com.du.test1.dao.UserDao;
import com.du.test1.entity.User;
import com.du.test1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IDEA
 *
 * @author duzhentong
 * @Date 2018/6/16
 * @Time 8:37
 */

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User findUserByID(int id) {
        return userDao.findUserByID(id);
    }

    public void setSqlSessionFactory(org.mybatis.spring.SqlSessionFactoryBean sqlSessionFactory) {
    }
}
