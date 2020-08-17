package com.dhy.personal.designpattern.behavioral.interpreter;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/17 16:55
 */
public class AddInterpreter implements Interpreter {
    private Interpreter fireInterpreter, secondInterpreter;

    public AddInterpreter(Interpreter fireInterpreter, Interpreter secondInterpreter) {
        this.fireInterpreter = fireInterpreter;
        this.secondInterpreter = secondInterpreter;
    }

    @Override
    public int interpreter() {
        return this.fireInterpreter.interpreter() + this.secondInterpreter.interpreter();
    }

    @Override
    public String toString() {
        return "+";
    }
}
