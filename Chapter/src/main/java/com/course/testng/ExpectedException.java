package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {

//    异常测试：用于预期结果就是某个异常时。

//    这是一个失败的异常测试：程序报错了
//    @Test(expectedExceptions = RuntimeException.class)
//    public void expectedFailed(){
//        System.out.println("这是一个失败的异常测试");
//    }

//    这是一个成功的异常测试：程序不报错，打印出预期结果
    @Test(expectedExceptions = RuntimeException.class)
    public void expectedSuccess(){
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }
}
