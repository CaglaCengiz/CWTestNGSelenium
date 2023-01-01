package clarusway.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day01_C09_AssertionTypes {

    @Test
    public void hardAssertion(){
        System.out.println( "Assertion öncesi çalısıyor");
        Assert.assertEquals(1,2);
        System.out.println("Assertion sonrası çalısıyor");
    }
    @Test
    public void softAssertion(){
        System.out.println( "Soft Assertion öncesi çalısıyor");
        SoftAssert softAssert=new SoftAssert();

        softAssert.assertEquals(1,2);//fail
        softAssert.assertTrue(true);//pass

        System.out.println("Soft Assertion sonrası çalısıyor");

        softAssert.assertAll("Failed Test");//method sonunda kesinlikle cagrılmalı
    }
    }





