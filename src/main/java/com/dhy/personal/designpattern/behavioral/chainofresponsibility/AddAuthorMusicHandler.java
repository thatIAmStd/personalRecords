package com.dhy.personal.designpattern.behavioral.chainofresponsibility;

import org.apache.commons.lang.StringUtils;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/17 11:41
 */
public class AddAuthorMusicHandler extends MusicHandler {
    @Override
    protected void doHandle(Music music) {
        if (StringUtils.isNotEmpty(music.getAuthor())) {
            System.out.println("添加作者[" + music.getAuthor() + "]成功");
            if (null != nextMusicHandler) {
                nextMusicHandler.doHandle(music);
            }
        } else {
            System.out.println("添加作者失败");
            return;
        }
    }
}
