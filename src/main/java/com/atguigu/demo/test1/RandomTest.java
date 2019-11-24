package com.atguigu.demo.test1;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        //Random random = new Random(10);
        //        //System.out.println(random.nextInt(10));

        Random r=new Random(13);     //创建对象时传入种子

        //随机生成10个[0,100)之间的数
        for(int i=0;i<10;i++){

        System.out.println(r.nextInt(100));

        }
    }
}
