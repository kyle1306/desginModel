package com.atguigu.demo.mediator;

public class CoffeeMachine extends Colleague {

    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        //
        mediator.register(name,this);
    }

    public void startCoffee(){
        System.out.println("煮咖啡啦");
    }

    public void finishedCoffee(){
        System.out.println("咖啡煮好了");
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);
    }
}
