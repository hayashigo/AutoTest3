package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnXml {

//    xml文件实现多线程

    @Test
    public void test1(){
        System.out.printf("Thread ID: %s%n", Thread.currentThread().getId());
    }

    @Test
    public void test2(){
        System.out.printf("Thread ID: %s%n", Thread.currentThread().getId());
    }

    @Test
    public void test3(){
        System.out.printf("Thread ID: %s%n", Thread.currentThread().getId());
    }
}
