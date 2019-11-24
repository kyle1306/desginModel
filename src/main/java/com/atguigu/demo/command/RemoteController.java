package com.atguigu.demo.command;

public class RemoteController {
    //  开按钮 的命令数组
    Command[] onCommands;
    Command[] offComands;
    //执行撤销的命令
    Command undoCommand;

    // 构造器，完成对按钮的初始化
    public RemoteController() {
        this.onCommands = new Command[5];
        this.offComands = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offComands[i] = new NoCommand();
        }
    }

    // 给我们的按钮设置你需要的命令
    public void setCommand(int no,Command onCommand,Command offCommand){
        this.onCommands[no] = onCommand;
        this.offComands[no] = offCommand;
    }

    // 按下开按钮
    public void onButtonPushed(int no){
        // 找到你按下的开的按钮，并调用对应方法
        onCommands[no].excute();
        // 记录这次的操作，用于撤销
        undoCommand = onCommands[no];
    }

    // 按下关按钮
    public void offButtonPushed(int no){
        // 找到你按下的开的按钮，并调用对应方法
        offComands[no].excute();
        // 记录这次的操作，用于撤销
        undoCommand = offComands[no];
    }

    // 按下撤销按钮
    public void undoButtonPushed(){
        undoCommand.undo();
    }

}
