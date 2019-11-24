package com.atguigu.demo.test1;

public class TestDemo {
    private static int i = 1;
    public int getNext(){
        return i++;
    }

    public static void main(String[] args) {
        TestDemo testDemo = new TestDemo();
        TestDemo testDemo1 = new TestDemo();
        testDemo.getNext();
        testDemo1.getNext();
        System.out.println(testDemo1.getNext());
    }
}
