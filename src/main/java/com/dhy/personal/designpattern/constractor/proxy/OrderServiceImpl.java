package com.dhy.personal.designpattern.constractor.proxy;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/9 19:05
 */
public class OrderServiceImpl implements IOrderService {

    private IOrderDao orderDao;

    @Override
    public int saveOrder(Order order) {

        orderDao = new OrderDaoImpl();
        System.out.println("service 调用 dao层");
        orderDao.insert(order);
        return 0;
    }
}
