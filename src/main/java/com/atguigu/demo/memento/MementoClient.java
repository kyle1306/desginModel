package com.atguigu.demo.memento;

public class MementoClient {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("状态1：攻击力100");
        // 保存了当前的状态
        careTaker.add(originator.saveMemento());

        originator.setState("状态2：攻击力90");
        careTaker.add(originator.saveMemento());

        originator.setState("状态3：攻击力50");
        careTaker.add(originator.saveMemento());


        System.out.println("---当前的状态是：" + originator.getState());
        // 希望恢复到状态1
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("+++当前的状态是：" + originator.getState());
    }
}
