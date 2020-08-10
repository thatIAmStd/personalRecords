package com.dhy.personal.designpattern.constractor.proxy.staticproxy;

import com.dhy.personal.designpattern.constractor.proxy.IOrderService;
import com.dhy.personal.designpattern.constractor.proxy.Order;
import com.dhy.personal.designpattern.constractor.proxy.OrderServiceImpl;
import com.dhy.personal.designpattern.constractor.proxy.db.DataSourceContexHolder;

/**
 * 静态代理类
 *
 * @author ：denghaoyuan
 * @date ：create in 2020/8/9 19:10
 */
public class OrderServiceStaticProxy {

    private IOrderService iOrderService;

    /**
     * 代理saveOrder这个方法
     */
    public int saveOrder(Order order) {
        beforeProxy(order);
        iOrderService = new OrderServiceImpl();
        int count = iOrderService.saveOrder(order);
        afterProxy();
        return count;
    }

    public void beforeProxy(Order order) {

        //分库
        int userId = order.getUserId();
        int routeDataSource = userId % 2;
        System.out.println("路由到【db" + routeDataSource + "】,执行数据库操作");
        DataSourceContexHolder.setDbType(String.valueOf(routeDataSource));
        System.out.println("代理前执行力这段代码");
    }

    public void afterProxy() {
        System.out.println("代理后执行了这段代码");
    }
}
