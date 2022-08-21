package org.example.suite;

import org.testng.annotations.AfterSuite;

public class Pay {
    @AfterSuite
    public void pay_1(){
        System.out.println("支付了");
    }

}
