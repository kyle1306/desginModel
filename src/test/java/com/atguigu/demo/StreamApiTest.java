package com.atguigu.demo;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiTest {
    /**
     *  1、filter()过滤
     *  2、distinct() 去重
     *  3、limit(long maxSize) 有限的
     *  4、skip(long n)  跳过n个
     *  5、peek(Consumer action) 对流中的每一个元素，执行Consumer 指定的操作
     *  6.sorted() 自然排序
     *      sorted(Comparator com) 定制排序
     *  7、map(Function f ) 对流中的每一个元素都映射Function指定的操作
     *  8、flatMap(Function f) 对流中的每一个元素都映射Function指定的操作
     *      ，每一个元素map映射后的结果是一个stream，最后合成一个大的stream

     */
    @Test
    public void testStreamApiFlatMap(){

    }


    @Test
    public void testStreamApiSorted(){
        Stream.of(1, 67, 3, 9, 37, 7, 49, 3)
                    .sorted()
                    .forEach(System.out::println);
    }
    @Test
    public void testStreamApiSkip(){
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);
        //skip
        stream = stream.skip(3);

        //终结操作
        long count = stream.count();

        //两个终结操作不能同时使用，执行终结操作后，会关闭流，下一句终结操作就会报异常
        System.out.println("总个数：" + count); //终结操作，执行统计
        // stream.forEach(System.out::println); // 终结操作 ，从4开始打印
    }

    @Test
    public void testStreamApi(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Stream<Integer> stream = list.stream();
        // Predict boolean test(T t)
        stream = stream.filter(num -> num % 2 == 0);
        //终结操作，验证结果
        stream.forEach(System.out::println);
    }

    @Test
    public void testStreamApiLimit(){
        //创建流
        Stream<Double> stream = Stream.generate(Math::random);

        //取有限个数
        stream = stream.limit(10);

        //终结操作
        stream.forEach(System.out::println);

    }

}
