package com.du.test1.dao;

import com.du.test1.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created with IDEA
 *
 * @author duzhentong
 * @Date 2018/6/15
 * @Time 16:46
 */

@Repository
public interface UserDao {
    public User findUserByID(int id);
}
