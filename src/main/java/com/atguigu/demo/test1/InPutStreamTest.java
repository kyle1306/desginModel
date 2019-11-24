package com.atguigu.demo.test1;

import java.io.*;

public class InPutStreamTest {

    public static void main(String[] args) throws IOException {
        //String separator = File.separator;
        //System.out.println(separator);
        File file = new File("e:" + File.separator + "file.txt");
        FileInputStream in = new FileInputStream(file);
        char temp = 0;
        //byte[] b = new byte[1024];
        //while ((temp = in.read()) != -1){
        //    System.out.println(temp);
        //}

        DataInputStream inputStream = new DataInputStream(in);

        while ((temp = inputStream.readChar()) != '\t'){
            System.out.println(temp);
        }

    }

}
