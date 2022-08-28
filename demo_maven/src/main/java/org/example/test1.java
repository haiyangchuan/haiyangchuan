package org.example;

import org.testng.annotations.*;

public class test1 {
    //最基本的注解，用来吧方法标记为测试的一部分
    @Test
    public void testcase1(){
        System.out.println("这个是测试用力1");
    }
    @BeforeTest//测试方法之前运行
    public void beforeMethod(){
        System.out.println("测试方法之前运行");
    }
    @AfterTest//测试方法之后运行
    public void afterMethod(){
        System.out.println("测试方法之后运行");
    }
    @BeforeClass
    public void BeforeClass(){
        System.out.println("这是在类运行前运行的方法");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("这是类之后运行的方法");
    }
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("测试套件前");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("测试套件后运行");
    }

}


