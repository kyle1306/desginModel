package com.atguigu.demo.visitor;

public class Man extends Person{

    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
