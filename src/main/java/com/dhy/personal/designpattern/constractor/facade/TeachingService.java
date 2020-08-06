package com.dhy.personal.designpattern.constractor.facade;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/6 20:21
 */
public class TeachingService {


    public void teach(Book book){
        System.out.println("教授课本："+ book.getName()+"完毕");
    }
}
