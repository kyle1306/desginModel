package com.atguigu.demo.interpreter;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> str = new Stack<>();
        str.push("a");
        str.push("b");
        str.push("c");
        System.out.println(str.pop()); // 弹出来
        System.out.println(str.pop());
        System.out.println(str.peek());// 查看栈顶元素，不会弹出
        System.out.println(str.peek());

    }
}
