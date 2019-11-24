package com.atguigu.demo.composite;

public class Client {
    public static void main(String[] args) {
        // 从大到小创建对象 学校
        OrganizationComponent university = new University("清华大学","中国顶级大学");

        // 创建学院
        OrganizationComponent computerCollege = new College("计算机学院","很it");
        OrganizationComponent chemisryCollege = new College("化学学院", "不想干这个了");

        university.add(computerCollege);
        university.add(chemisryCollege);

        // 创建各学院下面的系（专业）
        computerCollege.add(new Department("软件工程","这是软件工程"));
        computerCollege.add(new Department("计算机专业","这是计算机专业"));
        chemisryCollege.add(new Department("物理化学","这是物理还是化学"));
        chemisryCollege.add(new Department("有机化学","反正就是毒性比较大"));

        //university.print();
        computerCollege.print();
        //chemisryCollege.print();
    }
}
