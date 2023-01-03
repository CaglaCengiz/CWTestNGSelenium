package clarusway.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day03_C01_DataProvider {
    //Aynı testı bır defa yazıp bu testı bırden fazla veriye gore tekrar tekrar
    // calıstırma yetenegını bıze saglamıs olur.

    @Test(dataProvider = "dataProvider")
    public void test01(String name) {
        //verileri dataProvider methodundan alarak calısacak olan test
        System.out.println(name);
    }
    @DataProvider
    public Object[][]dataProvider(){
        //verileri teste saglayacak olan method
        Object[][]data={
                {"cagla"},
                {"cengiz"},
                {"clarusway"}
        };
        return data;
    }
}
