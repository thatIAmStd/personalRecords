package com.dhy.personal.designpattern.behavioral.interpreter;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/17 17:14
 */
public class Test {

    public static void main(String[] args) {
        String str = "3 2 4 + *";
        ExpressionPraser expressionPraser = new ExpressionPraser();
        int result = expressionPraser.parse(str);
        System.out.println("表达式执行结果为" + result);
    }
}
