package com.atguigu.demo.DesignMode;

public class ObjectAdapter implements Voltage5V{
    private Voltage220V voltage220V; // 依赖
    public ObjectAdapter(Voltage220V voltage220V){
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dest = 0;
        if (null != voltage220V){ // 注意判断对象是否引入成功
            int src = voltage220V.output220V();
            System.out.println("使用对象适配器进行转换");
            dest = src/44;
            System.out.println("适配完成，输出的电压为：" + dest);
        }
        return dest;
    }
}
