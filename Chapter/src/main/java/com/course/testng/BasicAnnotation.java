package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void testClass1(){
        System.out.println("Test这是测试用例1");
    }

    @Test
    public void testClass2(){
        System.out.println("Test这是测试用例2");
    }

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("BeforeMethod这是在测试方法之前运行");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("AfterMethod这是在测试方法之后运行的");
    }

    @BeforeClass
    public void BeforeClass(){
        System.out.println("BeforeClass这是在类运行之前运行的");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("AfterClass这是在类运行之后运行");
    }

    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BeforeSuite包裹着class，在class之前运行");
    }

    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterSuite包裹着class，在class之后运行");
    }

    @BeforeTest
    public void BeforeTest(){
        System.out.println("BeforeTest在@Test执行之前运行");
    }

    @AfterTest
    public void AfterTest(){
        System.out.println("AfterTest 在@Test执行之后运行");
    }
}
