package com.dhy.personal.designpattern.constractor.bradge;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/9 10:16
 */
public class ICBCBank extends Bank {

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    protected Account openOneAccount() {
        System.out.println("打开一个工商银行账号");
        account.openAccount();
        return this.account;
    }
}
