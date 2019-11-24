package com.atguigu.demo.facade;

public class TheaterLight {
    // 单例模式 饿汉
    private static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance() {
        return instance;
    }

    public void on(){
        System.out.println(" TheaterLight on ");
    }
    public void off(){
        System.out.println(" TheaterLight off ");
    }

    public void dim(){
        System.out.println(" TheaterLight id dimed ");
    }

    public void bright(){
        System.out.println(" TheaterLight is brighting ");
    }

    //public void play(){
    //    System.out.println(" dvd is playing ");
    //}
    //
    //public void pause(){
    //    System.out.println(" dvd pause ");
    //}
}
