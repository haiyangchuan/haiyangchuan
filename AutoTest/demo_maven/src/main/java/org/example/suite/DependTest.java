package org.example.suite;

import org.testng.annotations.Test;

public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 Run");
    }
    @Test(dependsOnMethods = "test1")  //dependsonMethod 依赖方法，但是依赖的方法没有执行，此用例也不会执行
    public void test2(){
        System.out.println("test2 Run");
    }
}
