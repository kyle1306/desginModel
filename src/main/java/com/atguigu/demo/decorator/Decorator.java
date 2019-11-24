package com.atguigu.demo.decorator;

public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink) { // 组合关系
        this.drink = drink;
    }

    @Override
    public float cost() {
        // super.getPrice() 自己的价格
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDes() {
        return super.des + " " + super.getPrice() +" && "+ drink.getDes();
    }
}
