package com.atguigu.demo.bridgemodel;
// 折叠式手机继承抽象类
public class FoldedPhone extends Phone {

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("折叠样式的手机");
    }

    public void close(){
        super.close();
        System.out.println("折叠样式的手机");
    }

    public void call(){
        super.call();
        System.out.println("折叠样式的手机");
    }

}
