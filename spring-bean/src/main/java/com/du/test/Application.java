package com.du.test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IDEA
 *
 * 使用单例的作用域，当加载xml文件的时候，bean就会创建，输出构造方法中的语句
 *
 * @author duzhentong
 * @Date 2018/6/3
 * @Time 15:59
 */
public class Application {
    public static void main(String[] args) {
        //使用单例的作用域，当加载xml文件的时候，bean就会创建，输出构造方法中的语句
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        //使用单例的作用域，两个对象其实是一个对象，最后输出true
        TestBean tb1 = (TestBean) ac.getBean("singleton");
        TestBean tb2 = (TestBean) ac.getBean("singleton");
        System.out.println(tb1 == tb2);

        System.out.println("-------------------------");

        //使用protetype原型的作用域，每次调用getbean都会创建一个bean，执行两次构造方法，输出两次构造方法中的内容，最后输出false
        TestBean tb3 = (TestBean) ac.getBean("prototype");
        TestBean tb4 = (TestBean) ac.getBean("prototype");
        System.out.println(tb3 == tb4);
    }
}
