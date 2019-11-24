package com.atguigu.demo.exam1;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOTest {

    @Test
    public void testBufferedReader() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("./1.txt"));

        String s = bufferedReader.readLine();
        System.out.println(s);
    }
}
