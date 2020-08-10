package com.dhy.personal.designpattern.constractor.adapter;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/7 20:29
 */
public class PowerAdapter implements DC5 {
    private AC220 ac220 = new AC220();

    @Override
    public void outPutDC() {
        int i = ac220.outPut();

        //变压器
        int j = i /44;
        System.out.println("输入电压"+i+"V,输出电流"+j+"安");
    }
}
