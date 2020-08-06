package com.dhy.personal.designpattern.constractor.facade;

/**
 * 教书外观类
 *
 * @author ：denghaoyuan
 * @date ：create in 2020/8/6 20:19
 */
public class TeachingFacade {

    private NameStudentService nameStudentService = new NameStudentService();
    private TeachingService teachingService = new TeachingService();
    private ScoreService socreService = new ScoreService();

    public void doAction(Book book) {
        nameStudentService.namePeople();
        teachingService.teach(book);
        socreService.doAction();
    }
}
