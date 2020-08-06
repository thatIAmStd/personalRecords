package com.dhy.personal.designpattern.constractor.decorator.v2;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/6 21:42
 */
public class Test {

    public static void main(String[] args) {
        AMan man = new RealMan();
        man = new CleanMan(man);
        man = new CleanMan(man);
        man = new CleanMan(man);
        man = new CleanMan(man);

        man = new CookMan(man);


        System.out.println(man.work() + " ，直到累死后赚取 " + man.getMoney());
    }
}
