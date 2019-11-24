package com.atguigu.demo.test1;

public class SingletonEnumDemo {
    public static void main(String[] args) {
        SingletonEnum instance1 = SingletonEnum.INSTANCE;
        SingletonEnum instance2 = SingletonEnum.INSTANCE;
        System.out.println(instance1 == instance2);

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        instance1.say();
    }
}

enum SingletonEnum{
    INSTANCE; // 属性

    public void say(){
        System.out.println("ok---");
    }
}