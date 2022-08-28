package org.example.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DateProvoiderTest {
    @Test(dataProvider ="date")
    public void DateProvoider(String name,int age){
        System.out.println("测试"+name+age);
        System.out.println("别的");
    }

    @DataProvider(name = "date")//将这个方法名一次一次传参
    public Object[][] providerDate() {
        Object[][] o = new Object[][]{
                {"zhnag",10},
                {"lisi",20},
                {"huangtian",30}//传参
        };
        return o;
    }
    @Test(dataProvider = "methodDate")
    public void test1(String name,int age){
        System.out.println("test1"+name+age);
        System.out.println("1");
    }
    @Test(dataProvider = "methodDate")
    public void test2(String name,int age){
        System.out.println("test2"+name+age);
        System.out.println("2");

    }
    @DataProvider(name = "methodDate")//通过不同方法名传参
    public Object[][] methodDateTest(Method method){
        Object[][] a = null;
        if (method.getName().equals("test1")){
            a=new Object[][]{
                    {"zhang",30},
                    {"lisi",40}
            };
        }else if (method.getName().equals("test2")){
            a=new Object[][]{
                    {"wnag",70},
                    {"zhang",80}
            };
        }
        return a;
    }
}
