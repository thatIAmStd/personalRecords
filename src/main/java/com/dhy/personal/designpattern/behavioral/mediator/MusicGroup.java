package com.dhy.personal.designpattern.behavioral.mediator;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/16 10:52
 */
public class MusicGroup {

    public static void sendMessage(User user, String msg){

        //这里还可以敏感字处理等各种扩展
        System.out.println(user.getName()+"说："+msg);
    }
}
