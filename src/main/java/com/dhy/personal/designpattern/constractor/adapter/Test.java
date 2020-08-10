package com.dhy.personal.designpattern.constractor.adapter;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/7 20:32
 */
public class Test {

    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.outPutDC();
    }
}
