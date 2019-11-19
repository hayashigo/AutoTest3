package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "tea")
public class GroupsOnClass3 {

    //    老师组
    public void teacher1(){
        System.out.println("GroupsOnClass3中的teacher1");
    }

    public void teacher2(){
        System.out.println("GroupsOnClass3中的teacher2");
    }
}
