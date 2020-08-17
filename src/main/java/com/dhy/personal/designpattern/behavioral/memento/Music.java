package com.dhy.personal.designpattern.behavioral.memento;

import lombok.Data;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/17 20:04
 */
@Data
public class Music {

    private String name;

    private String context;

    private String author;

    public MusicMemento saveMemento() {
        MusicMemento musicMemento = new MusicMemento();
        musicMemento.setAuthor(this.author);
        musicMemento.setContext(this.context);
        musicMemento.setName(this.name);
        return musicMemento;
    }

    public void undoFromMemento(MusicMemento musicMemento) {
        this.name = musicMemento.getName();
        this.context = musicMemento.getContext();
        this.author = musicMemento.getAuthor();
    }
}
