package com.dhy.personal.designpattern.behavioral.templatemethod;

/**
 *  开音乐会
 * @author ：denghaoyuan
 * @date ：create in 2020/8/13 16:16
 */
public abstract class PlayConcert {

    abstract void takeInstruments();

    protected void lightUp(){
        System.out.println("开灯");
    };

    abstract void playSong();

    protected boolean isOpenLight(){
        return  false;
    }


    public void doPlayConcert(){
        takeInstruments();

        if(isOpenLight()){
            lightUp();
        }

        playSong();
    }

}
