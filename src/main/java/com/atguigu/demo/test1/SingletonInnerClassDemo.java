package com.atguigu.demo.test1;

public class SingletonInnerClassDemo {
    // 私有构造器
    private SingletonInnerClassDemo(){}

    // 静态内部类

    /**
     *  静态内部类：
     *  1、外部类被转载的时候，内部类不会被装载
     *  2、外部类的方法中，调用内部类时，内部类会被装载，并且是线程安全的
     *  3、类的静态属性只会被装载一次，所以是线程安全的
     */
    private static class SingletonInstance{
        private static final SingletonInnerClassDemo INSTANCE = new SingletonInnerClassDemo();
    }

    public static SingletonInnerClassDemo getInstance(){
        return SingletonInstance.INSTANCE;
    }

}
