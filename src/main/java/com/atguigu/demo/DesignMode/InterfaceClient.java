package com.atguigu.demo.DesignMode;

public class InterfaceClient {
    public static void main(String[] args) {

        AbsAdapter absAdapter = new AbsAdapter() {
            // 只要覆盖我们要使用的接口方法
            @Override
            public void m1() {
                System.out.println("使用了m1的方法");
            }
        };

        absAdapter.m1();
    }
}
