package com.atguigu.demo.exam1;

import org.junit.Test;

public class RandomTest {

    @Test
    public void testRandom(){
        for (int i = 0; i < 1000; i++) {
            double result = Math.random() / Math.random();
            System.out.println(result);
        }
    }

    @Test
    public void testReplace(){
        String str = "abcbe";
        String str2 = str.replace(str.charAt(1), 'f');
        char c = str.charAt(1);
        System.out.println(str);
        System.out.println(str2);

    }
}
