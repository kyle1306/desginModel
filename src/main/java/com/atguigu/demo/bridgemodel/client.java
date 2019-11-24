package com.atguigu.demo.bridgemodel;

public class client {
    public static void main(String[] args) {
        // 获取折叠式手机（样式 + 品牌）
        FoldedPhone foldedPhone = new FoldedPhone(new XiaoMi());
        foldedPhone.open();
        foldedPhone.call();
        foldedPhone.close();

        System.out.println("=============");

        UpRightPhone upRightPhone = new UpRightPhone(new Vivo());
        upRightPhone.open();
        upRightPhone.call();
        upRightPhone.close();

    }
}
