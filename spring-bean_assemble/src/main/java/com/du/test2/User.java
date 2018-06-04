package com.du.test2;

/**
 * Created with IDEA
 *
 * @author duzhentong
 * @Date 2018/6/4
 * @Time 10:54
 */
public class User {
    private Student student;

    public User(Student student) {
        this.student = student;
    }

    public User() {

    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void say() {
        student.say();
    }
}
