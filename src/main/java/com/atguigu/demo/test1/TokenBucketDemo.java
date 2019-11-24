package com.atguigu.demo.test1;


import com.google.common.util.concurrent.RateLimiter;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

// 令牌漏斗算法
public class TokenBucketDemo {

    RateLimiter rateLimiter = RateLimiter.create(10); //每秒的令牌数量  QPS=10

    public void doRequest(){
        if(rateLimiter.tryAcquire()){ // 获得令牌成功
            System.out.println(Thread.currentThread().getName() + "->请求成功");
        }else {
            System.out.println(Thread.currentThread().getName() + "请求失败");
        }
    }
    public static void main(String[] args) throws IOException {
        TokenBucketDemo tokenBucketDemo = new TokenBucketDemo();
        CountDownLatch latch = new CountDownLatch(1); //实例化一个倒计数器，count指定计数个数
        Random random = new Random(10);
        for (int i = 0; i < 20; i++) {
            new Thread(()->{
                try {
                    latch.await();  //等待，当计数减到0时，所有线程并行执行
                    Thread.sleep(random.nextInt(1000)); //睡1s以内，产生令牌10个，只有10个线程拿到令牌
                    tokenBucketDemo.doRequest();//另外10个线程请求失败
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            },"t"+i).start();
        }
        latch.countDown(); // 计数减一
        System.in.read(); //阻塞主线程
    }
}
