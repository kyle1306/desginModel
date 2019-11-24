package com.atguigu.demo.interpreter;

import com.atguigu.demo.memento.CareTaker;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {

    // 定义表达式
    private Expression expression;

    // 构造函数传参，并解析
    public Calculator(String expStr) { // expStr = a+b-c
        // 安排运算先后顺序
        Stack<Expression> stack = new Stack<>();
        // 表达式拆分成字符数组
        char[] charArray = expStr.toCharArray();

        Expression left = null;
        Expression right = null;
        // 遍历字符数组
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+'://
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left, right)); // 然后根据得到的left和right构建AddExpression加入到stack
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    // 如果是一个Var,就创建要给VarExpression对象，并push到stack
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
            }
        }
        // 当遍历完整个charArray数组后，stack就得到最后的Expression
        this.expression = stack.pop();
    }

    public int run(HashMap<String,Integer> var){
        // 最后将表达式 a+b 和 var绑定{a=10,b=20}
        // 然后传递给expression的interpreter进行解释执行
        return this.expression.interpreter(var);
    }
}
