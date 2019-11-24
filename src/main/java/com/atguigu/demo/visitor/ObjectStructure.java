package com.atguigu.demo.visitor;

import java.util.LinkedList;
import java.util.List;

public class ObjectStructure {
    // 维护一个集合
    private List<Person> personList = new LinkedList<>();

    // 增加到List
    public void attach(Person person) {
        personList.add(person);
    }

    // 移除
    public void detach(Person person) {
        personList.remove(person);
    }

    //    显示测评情况
    public void diplay(Action action) {
        for (Person person : personList) {
            person.accept(action);
        }
    }


}
