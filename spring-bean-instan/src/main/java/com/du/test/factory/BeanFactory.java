package com.du.test.factory;

/**
 * Created with IDEA
 *
 * @author duzhentong
 * @Date 2018/6/5
 * @Time 15:21
 */
public class BeanFactory {
    public BeanFactory() {
        System.out.println("实例化");
    }

    public TestBean3 createBean() {
        return new TestBean3();
    }
}
