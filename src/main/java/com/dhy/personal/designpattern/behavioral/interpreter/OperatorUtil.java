package com.dhy.personal.designpattern.behavioral.interpreter;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/17 17:01
 */
public class OperatorUtil {

    public static boolean isOperator(String str) {
        return "*".equals(str) || "+".equals(str);
    }

    public static Interpreter getExpressionObject(Interpreter firstExperssion, Interpreter secondExpression, String symbol) {
        if ("+".equals(symbol)) {
            return new AddInterpreter(firstExperssion, secondExpression);
        } else if ("*".equals(symbol)) {
            return new MultiInterpreter(firstExperssion, secondExpression);
        } else {
            throw new IllegalArgumentException("不支持【" + symbol + "】操作符");
        }
    }
}
