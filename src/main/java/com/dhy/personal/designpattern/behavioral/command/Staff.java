package com.dhy.personal.designpattern.behavioral.command;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/16 10:03
 */
public class Staff {

    private List<Command> commandList = Lists.newArrayList();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void excute() {
        commandList.forEach(Command::excute);
        commandList.clear();
    }

}
