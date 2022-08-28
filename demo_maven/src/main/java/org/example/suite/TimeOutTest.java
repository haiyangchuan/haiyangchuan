package org.example.suite;

import org.testng.annotations.Test;

public class TimeOutTest {
    @Test(timeOut = 3000)//期望在3000得到响应
    public void testSuccess() throws InterruptedException {
        Thread.sleep(4000);
    }
}
