package com.atguigu.demo.DesignMode;
// 接口适配器模式 用一个抽象类先实现全部的接口方法  ，具体我们需要用到哪个方法，再重写这个方法
// 这里为什么要定义成abstract(抽象类)呢
public abstract class AbsAdapter implements SrcInterface{
    // 默认实现 空方法
    public void m1(){}
    public void m2(){}
    public void m3(){}
    public void m4(){}
}
