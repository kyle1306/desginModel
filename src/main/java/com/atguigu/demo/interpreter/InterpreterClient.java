package com.atguigu.demo.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class InterpreterClient {
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr(); // a+b
        HashMap<String, Integer> var = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果" + expStr + "=" + calculator.run(var));

    }

    // 获得值映射
    private static HashMap<String, Integer> getValue(String expStr) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();

        for (char c : expStr.toCharArray()) {
            if (c != '+' && c != '-') {
                if (!map.containsKey(String.valueOf(c))) {
                    System.out.println("请输入" + String.valueOf(c) + "的值：");
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    map.put(String.valueOf(c), Integer.valueOf(in));
                }
            }
        }
        return map;
    }

    public static String getExpStr() throws IOException {
        System.out.println("请输入表达式：");
        // 获取输入流
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }
}
