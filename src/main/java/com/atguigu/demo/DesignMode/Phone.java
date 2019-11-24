package com.atguigu.demo.DesignMode;

public class Phone {
//    充电
    public void charging(Voltage5V voltage5V){
        if (voltage5V.output5V() == 5){
            System.out.println("电压为5伏，可以充电了~~");
        }else if (voltage5V.output5V() > 5){
            System.out.println("电压大于5伏，无法充电~~");
        }

    }
}
