package com.dhy.personal.designpattern.behavioral.memento;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/14 16:35
 */
public class Test {

    public static void main(String[] args) {
        MementoManager<MusicMemento> musicMementoManager = new MementoManager<>();
        Music music = new Music();
        music.setAuthor("dhy");
        music.setContext("wu ");
        music.setName("十一月的雨");
        musicMementoManager.addEle(music.saveMemento());
        System.out.println(music);


        music.setName("十二月的雨");
        musicMementoManager.addEle(music.saveMemento());
        System.out.println(music);


        music.setName("十三月的雨");
        musicMementoManager.addEle(music.saveMemento());
        System.out.println(music);

        music.undoFromMemento(musicMementoManager.getEle());
        System.out.println(music);

        music.undoFromMemento(musicMementoManager.getEle());
        System.out.println(music);

        music.undoFromMemento(musicMementoManager.getEle());
        System.out.println(music);


    }
}
