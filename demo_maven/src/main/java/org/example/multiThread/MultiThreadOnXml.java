package org.example.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnXml {
    @Test
    public void test1(){
        System.out.println(1);
        System.out.printf("Thresd Id : %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.println(2);
        System.out.printf("Thresd Id : %s%n",Thread.currentThread().getId());
    }
}
