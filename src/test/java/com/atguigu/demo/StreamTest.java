package com.atguigu.demo;

import org.junit.Test;

import java.util.stream.Stream;

public class StreamTest {
    /**
     *  生成stream的四种方式
     *  1、根据数组创建：Arrays.stream(数组)   JDK1.8新增的
     *  2、根据集合创建：集合对象.stream()     JDK1.8新增的
     *  3、Stream类.of(可变参数序列)
     *  4、创建无限流
     *      Stream.generate(Supplier s)
     *      iterate(T seed,UnaryOperator<T> f)
      */
    @Test
    public void testStream(){
        Stream<Integer> stream = Stream.iterate(1, num -> num + 2); // 无限流
        stream.forEach(System.out::println);
    }

    @Test
    public void testStream2(){
        Stream<Double> stream = Stream.generate(Math::random); //无限流
        stream.forEach(System.out::println);
    }

}
