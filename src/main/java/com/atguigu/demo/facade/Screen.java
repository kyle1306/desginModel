package com.atguigu.demo.facade;

public class Screen {
    // 单例模式 饿汉
    private static Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }

    public void up(){
        System.out.println(" Screen up ");
    }
    public void down(){
        System.out.println(" Screen down ");
    }
    //public void play(){
    //    System.out.println(" Screen is playing ");
    //}
    //
    //public void pause(){
    //    System.out.println(" Screen pause ");
    //}
}
