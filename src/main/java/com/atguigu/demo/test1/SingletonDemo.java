package com.atguigu.demo.test1;

public class SingletonDemo {
    // 禁止在多线程下的指令重排
    private static volatile SingletonDemo instance = null;
    private SingletonDemo(){
        System.out.println(Thread.currentThread().getName() + "我是构造方法SingletonDemo()");
    }
    /**
     * 步骤2和步骤3，不存在数据依赖关系，而且无论重排前还是重排后程序的执行结果在单线程中并没有改变
     * 因此这种重排优化是允许的
     *
     * 指令重排只会保证串行语义执行的一致性（单线程），但并不会关心多线程间语义的一致性
     *
     * 所以当一条线程访问instance不为null时，由于instance实例未必已初始化完成，也就造成线程安全问题
     */
    // DCL （double check lock 两段锁）双端检锁机制
    public static SingletonDemo getInstance(){
        if (instance == null){ // 第一次检查
            synchronized (SingletonDemo.class){
                if (instance == null){ // 第二次检查
                    instance = new SingletonDemo();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        // 并发多线程后，
        for (int i = 0; i < 10; i++) {
            new Thread(() ->{
                SingletonDemo.getInstance();
            },String.valueOf(i)).start();
        }
    }

}
