package com.atguigu.demo.exam1;

import org.junit.Test;

public class Exam1To50Test {
    //Double a=1.0是正确的java语句
    @Test
    public void testDouble(){
        //Double d = 1.0; //自动类型转化
        Double d = new Double(1d); // 1.0
        System.out.println(d);
    }

    @Test
    public void testStringBuilder(){
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b");
        System.out.println(sb.indexOf("a")); // 0
        sb.reverse();
        System.out.println(sb.indexOf("a")); // 1

        sb.setCharAt(0,'c');
        System.out.println(sb); // ca
        sb.setLength(1);
        System.out.println(sb);

    }
}
