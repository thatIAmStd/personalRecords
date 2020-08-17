package com.dhy.personal.designpattern.behavioral.interpreter;

import java.util.Stack;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/17 16:59
 */
public class ExpressionPraser {

    private Stack<Interpreter> stack = new Stack<>();

    public int parse(String str) {
        String[] strArray = str.split(" ");
        for (String symbol : strArray) {
            if (!OperatorUtil.isOperator(symbol)) {
                NumberInterpreter numberInterpreter = new NumberInterpreter(symbol);
                stack.push(numberInterpreter);
                System.out.println(String.format("入栈: %d", numberInterpreter.interpreter()));
            } else {

                //是运算符号。可以计算
                Interpreter firstInterpreter = stack.pop();
                Interpreter secondInterpreter = stack.pop();

                System.out.println(String.format("出栈: %d, %s", firstInterpreter.interpreter(), secondInterpreter.interpreter()));

                Interpreter interpreter = OperatorUtil.getExpressionObject(firstInterpreter, secondInterpreter, symbol);
                int result = interpreter.interpreter();
                NumberInterpreter resultExpression = new NumberInterpreter(result);
                stack.push(resultExpression);
                System.out.println(String.format("阶段结果入栈: %d", resultExpression.interpreter()));
            }
        }
        int result = stack.pop().interpreter();
        return result;
    }

}
