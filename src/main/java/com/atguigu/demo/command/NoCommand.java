package com.atguigu.demo.command;

/**
 * 没有任何命令，即空执行，用于初始化每个按钮，当调用空命令时，对象什么都不做
 * 其实这样是一种设计模式，可以省掉对空的判断
 */
public class NoCommand implements Command {

    // 聚合LightReceiver(执行者)
    private LightReceiver lightReceiver;

    public NoCommand() {

    }

    @Override
    public void excute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {

    }
}
