package com.atguigu.demo.command;
//创建命令接口
public interface Command {

    // 执行动作
    public void excute();
    public void undo();

}
