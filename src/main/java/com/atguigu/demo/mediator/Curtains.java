package com.atguigu.demo.mediator;
// 构建同事类的时候就会把自己注册到中介者对象中
public class Curtains extends Colleague {

    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        //注册到中介者
        mediator.register(name,this);
    }

    public void upCurtains(){
        System.out.println("I am holding up Curtains!");
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);
    }
}
