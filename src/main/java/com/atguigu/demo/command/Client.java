package com.atguigu.demo.command;

public class Client {
    public static void main(String[] args) {
        // 使用命令设计模式，完成用过遥控器，完成对电灯的操作

        // 创建电灯的对象（接收者）
        LightReceiver lightReceiver = new LightReceiver();

        //创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        // 需要一个遥控器
        RemoteController remoteController = new RemoteController();
        // 给遥控器设置命令，比如no=0 是电灯的开和关的操作
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        System.out.println("=====按下灯的开按钮======");
        remoteController.onButtonPushed(0);
        System.out.println("=====按下灯的关的按钮======");
        remoteController.offButtonPushed(0);
        System.out.println("=====按下撤销按钮======");
        remoteController.undoButtonPushed();
    }
}
