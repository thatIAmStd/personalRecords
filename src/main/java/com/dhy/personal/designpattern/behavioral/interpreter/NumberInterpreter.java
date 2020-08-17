package com.dhy.personal.designpattern.behavioral.interpreter;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/17 17:03
 */
public class NumberInterpreter implements Interpreter{

    private int number;

    public NumberInterpreter(int number) {
        this.number = number;
    }

    public NumberInterpreter(String number){
        this.number = Integer.parseInt(number);
    }

    @Override
    public int interpreter() {
        return this.number;
    }
}
