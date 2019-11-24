package com.atguigu.demo;

import org.junit.Test;

import java.util.Optional;

public class OptionalTest {
    @Test
    public void testOptional8(){
        String str = "beijing";
        Optional<String> opt = Optional.ofNullable(str);
        // 函数式接口 R apply(T t)
        opt = opt.map(string -> string.toUpperCase()); // opt是不可变对象 ，要接收映射的新对象
        System.out.println(opt);
    }
    @Test
    public void testOptional7(){
        /**
         *  其他方法 ：
         *  1、判断容器中的值是否存在
         *  isPresent
         */
        String a = "beijing";
        String str = null;
        Optional<String> optional = Optional.ofNullable(a);
        optional.ifPresent(System.out::println);
    }
    @Test
    public void testOptional6(){
        String str = "北京";
        Optional<String> opt = Optional.ofNullable(str);
        /**
         * T orElseGet(Supplier<? extends T> other )
         * Supplier函数式的供给型接口
         * String::new 表示提供一个空字符串对象
         */
        String s = opt.orElseGet(String::new);
        System.out.println(s);
    }
    // orElse orElseGet orElseThrowable
    @Test
    public void testOptional5(){
        String str = null;
        Optional<String> opt = Optional.ofNullable(str);
        System.out.println(opt.orElse("这是默认值"));
    }
    @Test
    public void testOptional4(){
        // 从option容器中取出对象时， get() <===> of()   || ofNullable() <===> orElse()
        String str = "beijing";
        Optional<String> opt = Optional.of(str);
        System.out.println(opt.get());
    }
    @Test
    public void testOptional3(){
        String str = null;
        String a = "北京";
        //用来创建一个可能非空也可能空的optional对象
        Optional<String> opt = Optional.ofNullable(a);
        System.out.println(opt);
    }

    @Test
    public void testOptional2(){
        //String str = null;
        String str = "beijing";
        Optional<String> opt = Optional.of(str); //只能接收非空对象 ，否则会报异常，NullPointerException
        System.out.println(opt);
        //String s = opt.get();
        //System.out.println(s);
    }

    @Test
    public void testOptional(){
        Optional<Object> opt = Optional.empty();
        System.out.println(opt);

        //Object o = opt.get();

    }

}
