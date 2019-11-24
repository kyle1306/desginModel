package com.atguigu.demo.visitor;

public class VisitorClient {
    public static void main(String[] args) {

        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());
        objectStructure.attach(new Man());

        // 成功
        Success success = new Success();
        objectStructure.diplay(success);

        System.out.println("=============");
        Fail fail = new Fail();
        objectStructure.diplay(fail);

        System.out.println("============");
        Wait wait = new Wait();
        objectStructure.diplay(wait);
    }
}
