package org.example.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotion {
    @Test(invocationCount = 5,threadPoolSize = 3) //线程  线程池
    public void test(){
        System.out.println("1");//换行打印
        System.out.printf("Thread Id :%s%n",Thread.currentThread().getId());//格式化打印
    }
}
