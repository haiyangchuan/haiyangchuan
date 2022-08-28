package org.example.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterTest {
    @Test
    @Parameters({"name","age"})  //配置的时候不能配置在classes里面，需要同级
    public void param1eTest2(String name,int age){
        System.out.println(name+age);
    }
}

