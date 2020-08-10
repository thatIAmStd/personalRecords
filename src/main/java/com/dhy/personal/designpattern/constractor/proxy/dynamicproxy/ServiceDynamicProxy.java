package com.dhy.personal.designpattern.constractor.proxy.dynamicproxy;

import com.dhy.personal.designpattern.constractor.proxy.Order;
import com.dhy.personal.designpattern.constractor.proxy.db.DataSourceContexHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/9 19:56
 */
public class ServiceDynamicProxy implements InvocationHandler {
    private Object target;

    public ServiceDynamicProxy(Object target) {
        this.target = target;
    }

    /**
     * 创建代理对象
     */
    public Object bind() {
        ClassLoader cls = target.getClass().getClassLoader();
        return Proxy.newProxyInstance(cls, target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object param = args[0];
        beforeProxy(param);
        Object obj = method.invoke(target, param);
        afterProxy();
        return obj;
    }

    public void beforeProxy(Object object) {
        int userId = 0;
        System.out.println("代理前执行力这段代码");

        if (object instanceof Order) {
            int routeDataSource = userId % 2;
            System.out.println("路由到【db" + routeDataSource + "】,执行数据库操作");
            DataSourceContexHolder.setDbType(String.valueOf(routeDataSource));
        }
    }

    public void afterProxy() {
        System.out.println("代理后执行了这段代码");
    }
}
