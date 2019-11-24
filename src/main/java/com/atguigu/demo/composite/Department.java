package com.atguigu.demo.composite;

public class Department extends OrganizationComponent {

    public Department(String name, String des) {
        super(name, des);
    }


    // add,remove 就不用再重写了，因为他是叶子节点
    @Override
    protected void print() {
        System.out.println(getName());
    }
}
