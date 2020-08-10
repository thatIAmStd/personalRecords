package com.dhy.personal.designpattern.constractor.bradge;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/9 10:18
 */
public class ABCBank extends Bank{

    public ABCBank(Account account) {
        super(account);
    }

    @Override
    protected Account openOneAccount() {
        System.out.println("打开一个农业银行账号");
        account.openAccount();
        return this.account;
    }
}
