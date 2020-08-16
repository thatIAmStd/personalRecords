package com.dhy.personal.designpattern.behavioral.command;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/16 10:06
 */
public class Test {

    public static void main(String[] args) {
        Staff staff = new Staff();

        Music music = new Music("烈日夏日酒店");
        Command openCommand = new OpenMusicCommand(music);
        Command closeCommand = new CloseMusicCommand(music);
        staff.addCommand(openCommand);
        staff.addCommand(closeCommand);

        staff.addCommand(openCommand);
        staff.addCommand(openCommand);
        staff.excute();
    }
}
