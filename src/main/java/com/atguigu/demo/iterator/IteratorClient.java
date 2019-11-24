package com.atguigu.demo.iterator;

import java.util.ArrayList;

public class IteratorClient {
    public static void main(String[] args) {

        // 创建学院
        ArrayList<College> collegeList = new ArrayList<>();

        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        collegeList.add(computerCollege);
        collegeList.add(infoCollege);

        OutputImpl output = new OutputImpl(collegeList);
        output.printCollege();
    }
}
