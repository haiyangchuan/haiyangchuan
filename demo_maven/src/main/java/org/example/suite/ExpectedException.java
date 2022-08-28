package org.example.suite;

import org.testng.annotations.Test;

public class ExpectedException {
    @Test(expectedExceptions = RuntimeException.class)//异常用例抛出异常expectedExceptions+
    public void yichanghans(){
        System.out.println("异常用例执行了");
        throw new RuntimeException();

    }
}
