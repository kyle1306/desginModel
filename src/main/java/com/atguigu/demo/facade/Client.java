package com.atguigu.demo.facade;

public class Client {
    public static void main(String[] args) {

        // 直接调用，扩展性会比较差

        // 外观模式
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
        homeTheaterFacade.pause();
        homeTheaterFacade.end();
    }
}
