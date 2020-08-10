package com.dhy.personal.designpattern.constractor.bradge;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/9 10:21
 */
public class DepositAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开一个活期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}
