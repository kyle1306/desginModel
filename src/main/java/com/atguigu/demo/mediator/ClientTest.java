package com.atguigu.demo.mediator;

public class ClientTest {
    public static void main(String[] args) {
        // 创建中介者
        Mediator mediator = new ConcreteMediator();
        // 创建Alarm并且加入到ConcreteMediator
        Alarm alarm = new Alarm(mediator, "alarm");
        // 创建CoffeeMachine 并加入到中介者的map中
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");
        //创建Curtains 并加入到中介者的map中
        Curtains curtains = new Curtains(mediator, "curtains");
        TV tv = new TV(mediator, "TV");

        alarm.sendMessage(0);
        coffeeMachine.finishedCoffee();
        alarm.sendMessage(1);
    }
}
