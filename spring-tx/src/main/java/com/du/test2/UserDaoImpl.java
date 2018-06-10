package com.du.test2;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author duzhentong
 * @Date 2018/6/9
 * @Time 10:15
 */
public class UserDaoImpl implements UserDao {

    //声明JdbcTemplate属性及方法
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addUser(User user) {
        String sql = "insert into user(id,username) value(?,?)";
        Object[] obj = new Object[]{user.getId(), user.getUsername()};
        int num = this.jdbcTemplate.update(sql, obj);
        return num;
    }

    @Override
    public int updateUser(User user) {
        String sql = "update user set username=? where id=?";
        Object[] obj = new Object[]{user.getUsername(), user.getId()};
        int num = this.jdbcTemplate.update(sql, obj);
        return num;
    }

    @Override
    public int deleteUser(int id) {
        String sql = "delete from user where id=?";
        int num = this.jdbcTemplate.update(sql, id);
        return num;
    }

    @Override
    public User findUserById(int id) {
        String sql = "select * from user where id=?";
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
        //通过RowMapper返回一个Object类型的行记录
        return this.jdbcTemplate.queryForObject(sql, rowMapper, id);
    }

    @Override
    public List<User> findAllUser() {
        String sql = "select * from user";
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);
        return this.jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public void transfer(int outUserId, int inUserId, int money) {
        this.jdbcTemplate.update("update log set logging=logging+? where user_id=?", money, inUserId);
        System.out.println("转账之前");
        int i = 1 / 0;
        System.out.println("转账之后");
        this.jdbcTemplate.update("update log set logging=logging-? where user_id=?", money, outUserId);
    }

}
