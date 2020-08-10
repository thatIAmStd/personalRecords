package com.dhy.personal.designpattern.constractor.bradge;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/9 10:15
 */
public abstract class Bank {

    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    protected abstract Account openOneAccount();
}
