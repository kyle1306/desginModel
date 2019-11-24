package com.atguigu.demo.mediator;

// 具体的同事类
public class Alarm extends Colleague {

    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        //将同事对象注册到中介者对象
        // 在创建对象时，将自己放在concreteMediator管理的同事对象的集合中
        mediator.register(name,this);
    }
    // 自身的方法调用抽象类的方法
    public void sendAlarm(int stateChange){
        sendMessage(stateChange);
    }

    @Override
    public void sendMessage(int stateChange) {
        // 调用中介者的方法
        this.getMediator().getMessage(stateChange,this.name);
    }
}
