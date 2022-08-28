package org.example.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
@Test(groups = "student1")
public class GroupsOnMethod1 {
    public void test1() {
        System.out.println("student1z这使得服务的组1");
    }

    public void test2() {
        System.out.println("student1z这使得服务的组1");
    }


}