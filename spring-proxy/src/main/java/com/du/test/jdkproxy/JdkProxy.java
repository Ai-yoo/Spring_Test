package com.du.test.jdkproxy;

import com.du.test.aspect.MyAspect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created with IDEA
 *
 * @author duzhentong
 * @Date 2018/6/6
 * @Time 19:05
 */
public class JdkProxy implements InvocationHandler {

    //声明目标类接口
    private UserDao userDao;

    //创建代理方法
    public Object createProxy(UserDao userDao) {
        this.userDao = userDao;
        //获取类加载器
        ClassLoader classLoader = JdkProxy.class.getClassLoader();
        //获取被代理的类实现的所有接口
        Class[] clazz = userDao.getClass().getInterfaces();
        //返回代理后的对象
        return Proxy.newProxyInstance(classLoader, clazz, this);
    }

    /**
     * 所有动态代理的方法调用都会交给invoke()方法处理
     * @param proxy 被代理后的对象
     * @param method 将要执行的方法信息（通过反射获得）
     * @param args 执行方法时需要的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //声明切面
        MyAspect myAspect = new MyAspect();
        //前增强
        myAspect.check_User();
        //调用
        Object obj = method.invoke(userDao, args);
        //后增强
        myAspect.log();
        return obj;
    }

}
