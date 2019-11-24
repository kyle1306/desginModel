package com.atguigu.demo.mediator;

public class TV extends Colleague {

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        //
        mediator.register(name,this);
    }

    public void startTV(){
        System.out.println("开启电视机");
    }

    public void stopTV(){
        System.out.println("关闭电视机");
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);
    }
}
