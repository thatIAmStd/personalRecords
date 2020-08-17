package com.dhy.personal.designpattern.behavioral.chainofresponsibility;

import org.apache.commons.lang.StringUtils;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/17 11:17
 */
public class AddRemarkMusicHandler extends MusicHandler {


    @Override
    protected void doHandle(Music music) {

        if (StringUtils.isNotEmpty(music.getName())) {
            System.out.println("给音乐[" + music.getName() + "]添加备注成功");
            if (null != nextMusicHandler) {
                nextMusicHandler.doHandle(music);
            }
        } else {
            System.out.println("给音乐[" + music.getName() + "]添加备注失败");
            return;
        }
    }
}
