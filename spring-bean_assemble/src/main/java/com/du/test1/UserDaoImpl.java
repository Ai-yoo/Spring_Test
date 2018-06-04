package com.du.test1;

import org.springframework.stereotype.Repository;

/**
 * Created with IDEA
 *
 * @author duzhentong
 * @Date 2018/6/4
 * @Time 9:31
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void run() {
        System.out.println("userDao run!!!");
    }
}
