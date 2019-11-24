package com.atguigu.demo.decorator;

public class CoffeeBar {
    public static void main(String[] args) {
        // 装饰者模式下的订单：2份巧克力 + 一份牛奶的LongBlack

        // 1、点一份LongBlack
        Drink order = new Decof();
        System.out.println("费用1=" + order.cost());
        System.out.println("描述1=" + order.getDes());

        // 2、加一份牛奶
        order = new Milk(order);
        System.out.println("费用2=" + order.cost());
        System.out.println("描述2=" + order.getDes());

        // 3、加一份巧克力
        order = new Chocolate(order);
        System.out.println("费用3=" + order.cost());
        System.out.println("描述3=" + order.getDes());

        // 4、加一份巧克力
        order = new Chocolate(order);
        System.out.println("费用4=" + order.cost());
        System.out.println("描述4=" + order.getDes());
    }

    public static class DeCaf extends Coffee {

    }
}
