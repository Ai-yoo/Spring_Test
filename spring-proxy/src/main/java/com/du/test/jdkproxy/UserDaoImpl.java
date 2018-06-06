package com.du.test.jdkproxy;

/**
 * Created with IDEA
 *
 * @author duzhentong
 * @Date 2018/6/6
 * @Time 19:02
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void addUser() {
        System.out.println("添加用户");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除用户");
    }
}
