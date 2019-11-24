package com.atguigu.demo.memento;

public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 编写一个方法，可以保存一个状态对象 Memento
    // 因此编写一个方法，返回Memento
    public Memento saveMemento() {
        return new Memento(state);
    }

    // 得到状态
    public void getStateFromMemento(Memento memento) {
        this.state = memento.getState();
    }

}
