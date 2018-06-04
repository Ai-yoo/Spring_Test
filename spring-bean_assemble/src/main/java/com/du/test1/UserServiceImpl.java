package com.du.test1;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IDEA
 *
 * @author duzhentong
 * @Date 2018/6/4
 * @Time 16:44
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource(name = "userDao")
    private UserDao userDao;

    @Override
    public void run() {
        this.userDao.run();
        System.out.println("userService  run!!");
    }
}
