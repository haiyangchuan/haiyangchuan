package org.example.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
@Test(groups = "student2")
public class GroupsOnMethod2 {
    public void test1() {
        System.out.println("student2z这使得服务的组2");
    }

    public void test2() {
        System.out.println("student2z这使得服务的组2");
    }
}