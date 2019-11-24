package com.atguigu.demo.DesignMode;

public class VoltageAdapter extends Voltage220V implements Voltage5V{

    @Override
    public int output5V() {
        int src = output220V();
        return src/44;
    }
}
