package com.atguigu.demo.composite;

import java.util.ArrayList;
import java.util.List;

// University 可以管理College
public class University extends OrganizationComponent {

    List<OrganizationComponent> organizationComponents = new ArrayList<>();
    // 构造器
    public University(String name, String des) {
        super(name, des);
    }
    // 重写add
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        //super.add(organizationComponent);
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        //super.remove(organizationComponent);
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    // 输出University包含的学院
    @Override
    protected void print() {
        System.out.println("======="+ getName() +"=======");
        // 遍历organizationComponents
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}
