package org.example.suite;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {
    @Test(enabled = false)//忽略而测试：enabled
    public void Ignore1(){
        System.out.println("Ignore1 执行");
    }
    @Test(enabled = true)
    public void Ignore2(){
        System.out.println("Ignore2 执行");
    }
    @Test(enabled = false)
    public void Ignore3(){
        System.out.println("Ignore3 执行");
    }
}
