package com.atguigu.demo.test1;

import java.util.Scanner;

public class JieChengDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = getJieCheng(num);
        System.out.println("阶乘结果为：" + result);
    }
    public static int getJieCheng(int n){
        if(n < 0){
            System.out.println("请输入正确的数字");
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return getJieCheng(n-1)*n;
    }

}
