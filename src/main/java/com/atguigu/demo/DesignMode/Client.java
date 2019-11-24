package com.atguigu.demo.DesignMode;

public class Client {
    public static void main(String[] args) {
        //System.out.println("类适配器模式===");
        //Phone phone = new Phone();
        //phone.charging(new VoltageAdapter());


        System.out.println("对象适配器模式==");
        Phone phone = new Phone();
        phone.charging(new ObjectAdapter(new Voltage220V()));
    }
}
