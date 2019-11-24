package com.atguigu.demo.memento.game;

public class MementoGameRoleClient {
    public static void main(String[] args) {

        // 创建游戏角色
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);

        System.out.println("和boss大战前的状态");
        gameRole.display();

        // 把当前状态保存下来caretaker
        Caretaker caretaker = new Caretaker();
        System.out.println("保存当前状态");
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("和boss大战··");
        gameRole.setVit(30);
        gameRole.setDef(30);

        gameRole.display();

        System.out.println("大战后，使用备忘录对象恢复到战前");

        gameRole.recoverGameRole(caretaker.getMemento());
        System.out.println("恢复后的状态");
        gameRole.display();

    }
}