package com.atguigu.demo.decorator;

import java.io.*;

public class DecoratorTest {
    public static void main(String[] args) throws IOException {

        InputStream is = new DataInputStream(new FileInputStream("e:\\abc.txt"));
        System.out.println(is.read());
        is.close();

    }
}
