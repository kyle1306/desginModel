package com.atguigu.demo.strategy;

public class PekingDuck extends Duck {

    @Override
    public void display() {
        System.out.println("这是北京鸭");
    }

    // 因为北京鸭不能飞，因此需要重写父类方法


    @Override
    public void fly() {
        System.out.println("北京鸭不能飞");
    }
}
