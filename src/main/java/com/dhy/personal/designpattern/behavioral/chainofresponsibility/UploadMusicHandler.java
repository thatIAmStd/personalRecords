package com.dhy.personal.designpattern.behavioral.chainofresponsibility;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/17 10:56
 */
public class UploadMusicHandler extends MusicHandler {


    @Override
    protected void doHandle(Music music) {
        if (null != music) {

            System.out.println("上传音乐[" + music.getName() + "]成功");
            if (null != nextMusicHandler) {
                nextMusicHandler.doHandle(music);
            }
        } else {
            System.out.println("上传音乐[" + music + "]失败");

            return;
        }
    }
}
