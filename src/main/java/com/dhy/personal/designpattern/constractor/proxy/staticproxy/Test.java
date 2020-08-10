package com.dhy.personal.designpattern.constractor.proxy.staticproxy;

import com.dhy.personal.designpattern.constractor.proxy.Order;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/9 19:31
 */
public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
