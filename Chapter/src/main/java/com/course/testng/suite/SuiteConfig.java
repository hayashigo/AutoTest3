package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

// 测试之前的配置或准备，公用的
public class SuiteConfig {

    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("Before Suite 运行啦");
    }

    @AfterSuite
    public void AfterSuite(){
        System.out.println("after suite 运行啦");
    }

    @BeforeTest
    public void BeforeTest(){
        System.out.println("Before test");
    }

    @AfterTest
    public void AfterTest(){
        System.out.println("After test");
    }
}
