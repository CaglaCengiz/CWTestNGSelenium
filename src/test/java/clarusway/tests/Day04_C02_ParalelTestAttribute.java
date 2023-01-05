package clarusway.tests;

import org.testng.annotations.Test;

public class Day04_C02_ParalelTestAttribute {
    @Test(
            threadPoolSize = 4,//testımızın kac cekırdekte paralel olarak calısacagını belirler
            invocationCount = 7//testımızın kac defa calıstırılacagını belırler
    )
    public void test() {
        System.out.println("Current thread Id" + Thread.currentThread().getId());
    }
}
