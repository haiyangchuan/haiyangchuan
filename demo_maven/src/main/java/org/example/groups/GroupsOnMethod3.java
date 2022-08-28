package org.example.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
@Test(groups = "teacher")
public class GroupsOnMethod3 {
    public void test1() {
        System.out.println("teacherz这使得服务的组3");
    }

    public void test2() {
        System.out.println("teacher这使得服务的组3");
    }


}