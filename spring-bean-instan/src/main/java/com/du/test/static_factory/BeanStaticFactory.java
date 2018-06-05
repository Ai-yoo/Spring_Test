package com.du.test.static_factory;

/**
 * Created with IDEA
 *
 * @author duzhentong
 * @Date 2018/6/5
 * @Time 15:14
 */
public class BeanStaticFactory {
    //工厂方法创建TestBean实例
    public static TestBean2 createBean() {
        return new TestBean2();
    }
}
