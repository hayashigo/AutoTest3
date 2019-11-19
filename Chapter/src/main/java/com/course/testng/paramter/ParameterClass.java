package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterClass {

    @Test
    @Parameters({"name","age"})
    public void test(String name, int age){
        System.out.println("name is "+name + ", age is "+age);
    }
}
