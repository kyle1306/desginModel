package com.atguigu.demo.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento){
        // 添加到集合中
        mementoList.add(memento);
    }

    // 获取到第index个Originator的备忘录对象（即保存状态）
    public Memento get(int index){
        return mementoList.get(index);
    }

}
