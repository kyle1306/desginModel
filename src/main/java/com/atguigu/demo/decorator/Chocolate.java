package com.atguigu.demo.decorator;

// 具体的Descorator,这里就是具体的调味品
public class Chocolate extends Decorator {

    public Chocolate(Drink drink) {
        super(drink);
        setDes(" 巧克力 ");
        setPrice(3.0f); // 调味品的价格
    }
}
