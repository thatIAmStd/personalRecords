package com.dhy.personal.designpattern.behavioral.chainofresponsibility;

/**
 * 音乐责任联父类
 * @author ：denghaoyuan
 * @date ：create in 2020/8/17 10:52
 */
public abstract class MusicHandler {

    protected MusicHandler nextMusicHandler;

    protected void setNextHandler(MusicHandler musicHandler){
        this.nextMusicHandler = musicHandler;
    }

    abstract protected  void doHandle(Music music);

}
