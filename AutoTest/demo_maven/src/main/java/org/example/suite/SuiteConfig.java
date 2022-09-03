package org.example.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("befote suite 运行了");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("Aftersuite  运行了");
    }
}
