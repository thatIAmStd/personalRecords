package com.dhy.personal.designpattern.behavioral.state;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/17 17:36
 */
public class Test {

    public static void main(String[] args) {
        MusicStateContext musicStateContext = new MusicStateContext();
        musicStateContext.setMusicState(new PlayState());
        System.out.println("当前状态:"+musicStateContext.getMusicState().getClass().getSimpleName());

        musicStateContext.pause();
        System.out.println("当前状态:"+musicStateContext.getMusicState().getClass().getSimpleName());

        musicStateContext.stop();
        System.out.println("当前状态:"+musicStateContext.getMusicState().getClass().getSimpleName());


        musicStateContext.speed();
        System.out.println("当前状态:"+musicStateContext.getMusicState().getClass().getSimpleName());
    }
}
