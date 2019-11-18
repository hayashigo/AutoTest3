package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsTest {

    @Test(groups = "server")
    public void test1(){
        System.out.println("server 的方法 1111");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("server 的方法 2222");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("Client 的方法 3333");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("Client 的方法 4444");
    }

    @BeforeGroups("server")
    public void BeforeGroupsOnServer(){
        System.out.println("这是服务端组！！之前运行");
    }

    @AfterGroups("server")
    public void AfterGroupsOnServer(){
        System.out.println("这是服务端组！！之后运行");
    }

    @BeforeGroups("client")
    public void BeforeGroupsOnClient(){
        System.out.println("这是客户端组！！之前运行");
    }

    @AfterGroups("client")
    public void AfterGroupsOnClient(){
        System.out.println("这是客户端组！！之后运行");
    }
}
