package com.course.testng.paramter;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name is "+name + ", age is "+age);
    }

    @DataProvider(name = "data")
    public Object[][] testDataProvider(){
        Object[][] o = new Object[][]{
                {"zhangsan",18},
                {"lisi",22},
                {"wangwu",30}
        };
        return o;
    }


//    dataProvider实现根据方法名来进行参数传递
    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("这是test1: name is "+name + ", age is "+age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("这是test2: name is "+name + ", age is "+age);
    }

    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result = null;

        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"zhangsan",10},
                    {"lisi",25}
            };
        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"wangwu",50},
                    {"zhaoliu",60}
            };
        }

        return result;
    }

}
