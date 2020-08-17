package com.dhy.personal.designpattern.behavioral.chainofresponsibility;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/17 11:18
 */
public class Test {

    public static void main(String[] args) {
        MusicHandler addRemark = new AddRemarkMusicHandler();
        MusicHandler uploadMusic = new UploadMusicHandler();
        MusicHandler addAuthor = new AddAuthorMusicHandler();
        addRemark.setNextHandler(uploadMusic);
        uploadMusic.setNextHandler(addAuthor);

        Music music = new Music();
        music.setName("烈日假日酒店");
//        music.setAuthor("hsf");
        addRemark.doHandle(music);
    }
}
