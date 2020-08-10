package com.dhy.personal.designpattern.constractor.proxy.dynamicproxy;

import com.dhy.personal.designpattern.constractor.proxy.IOrderService;
import com.dhy.personal.designpattern.constractor.proxy.Order;
import com.dhy.personal.designpattern.constractor.proxy.OrderServiceImpl;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/9 20:05
 */
public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        IOrderService iOrderService = (IOrderService) new ServiceDynamicProxy(new OrderServiceImpl()).bind();
        iOrderService.saveOrder(order);
    }
}
