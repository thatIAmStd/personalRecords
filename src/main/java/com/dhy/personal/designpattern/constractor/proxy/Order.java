package com.dhy.personal.designpattern.constractor.proxy;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/9 19:03
 */
public class Order {

    private Object orderInfo;
    private Integer userId;

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
