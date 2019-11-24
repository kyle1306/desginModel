package com.atguigu.demo.facade;

public class Stereo {
    // 单例模式 饿汉
    private static Stereo instance = new Stereo();

    public static Stereo getInstance() {
        return instance;
    }

    public void on(){
        System.out.println(" Stereo on ");
    }
    public void off(){
        System.out.println(" Stereo off ");
    }
    public void up(){
        System.out.println(" Stereo is uping ");
    }

    public void pause(){
        System.out.println(" Stereo pause ");
    }
}
