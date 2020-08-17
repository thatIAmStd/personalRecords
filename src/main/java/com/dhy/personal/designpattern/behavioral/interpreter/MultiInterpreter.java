package com.dhy.personal.designpattern.behavioral.interpreter;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/17 16:57
 */
public class MultiInterpreter implements Interpreter {

    private Interpreter firstInterpreter, secondInterpreter;

    public MultiInterpreter(Interpreter firstInterpreter, Interpreter secondInterpreter) {
        this.firstInterpreter = firstInterpreter;
        this.secondInterpreter = secondInterpreter;
    }

    @Override
    public int interpreter() {
        return this.firstInterpreter.interpreter() * this.secondInterpreter.interpreter();
    }

    @Override
    public String toString() {
        return "*";
    }
}
