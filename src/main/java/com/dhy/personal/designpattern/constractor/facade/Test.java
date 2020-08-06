package com.dhy.personal.designpattern.constractor.facade;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/6 20:25
 */
public class Test {

    public static void main(String[] args) {
        Book book = new Book().setName("苍井空写真集");
        TeachingFacade teachingFacade = new TeachingFacade();
        teachingFacade.doAction(book);
    }
}
