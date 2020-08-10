package com.dhy.personal.designpattern.constractor.proxy;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/9 19:06
 */
public class OrderDaoImpl implements IOrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("插入一个订单");
        return 1;
    }
}
