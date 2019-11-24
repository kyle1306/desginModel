package com.atguigu.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.locks.ReentrantLock;


@RestController
public class HelloController {

    @GetMapping("hello")
    public String show() {
        System.out.println("这是第一个idea项目");
        int a = 6;
        /*
        *
        *
        * 
        * */




        ReentrantLock lock = new ReentrantLock();



        return "";
    }




}
