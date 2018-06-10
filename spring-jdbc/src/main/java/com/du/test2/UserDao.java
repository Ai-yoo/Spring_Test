package com.du.test2;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author duzhentong
 * @Date 2018/6/9
 * @Time 10:13
 */
public interface UserDao {
    //添加
    public int addUser(User user);
    //更新
    public int updateUser(User user);
    //删除用户
    public int deleteUser(int id);

    //通过id查询用户
    public User findUserById(int id);

    //查询所有用户
    public List<User> findAllUser();
}
