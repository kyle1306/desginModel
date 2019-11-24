package com.atguigu.demo.facade;

public class PopCorn {
    // 单例模式 饿汉
    private static PopCorn instance = new PopCorn();

    public static PopCorn getInstance() {
        return instance;
    }

    public void on(){
        System.out.println(" PopCorn on ");
    }
    public void off(){
        System.out.println(" PopCorn off ");
    }
    //public void play(){
    //    System.out.println(" PopCorn is playing ");
    //}

    //public void pause(){
    //    System.out.println(" PopCorn pause ");
    //}

    public void pop(){
        System.out.println(" PopCorn is poping ");
    }
}
