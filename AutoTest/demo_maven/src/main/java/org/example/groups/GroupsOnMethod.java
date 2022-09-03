package org.example.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod{
    @Test(groups = "servers")
    public void test1(){
        System.out.println("z这使得服务的组1");
    }
    @Test(groups = "servers")
    public void test2(){
        System.out.println("z这使得服务的组2");
    }
    @Test(groups = "servers")
    public void test3(){
        System.out.println("z这使得服务的组3");
    }

    @Test(groups = "click")
    public void test4(){
        System.out.println("z这使得服务的组4");
    }
    @Test(groups = "click")
    public void test5(){
        System.out.println("z这使得服务的组5");
    }
    @Test(groups = "click")
    public void test6(){
        System.out.println("z这使得服务的组6");
    }

    @BeforeGroups("click")//运行前运行的
    public void before(){
        System.out.println("运行前z这使得服务的组7");
    }
    @AfterGroups("servers")//运行后运行的
    public void after(){
        System.out.println("运行后z这使得服务的组8");
    }
}
//不管是运行前还是运行后，不会改变本类方法的运行顺序，只是在这个组基础的运行前和运行后