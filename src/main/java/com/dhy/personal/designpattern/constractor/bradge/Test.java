package com.dhy.personal.designpattern.constractor.bradge;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/9 10:22
 */
public class Test {

    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openOneAccount();
        icbcAccount.showAccountType();

        Bank abcBank = new ABCBank(new SavingAccount());
        Account abcAccount = abcBank.openOneAccount();
        abcAccount.showAccountType();
    }
}
