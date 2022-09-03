package org.example.suite;

import org.testng.annotations.BeforeSuite;

public class LoginTest {
    @BeforeSuite
    public void login(){
        System.out.println("登录了");
    }
}
