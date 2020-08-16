package com.dhy.personal.designpattern.behavioral.mediator;

import lombok.Data;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/16 10:53
 */
@Data
public class User {

    private String name;

    public void sendMsg(String msg) {
        MusicGroup.sendMessage(this, msg);
    }
}
