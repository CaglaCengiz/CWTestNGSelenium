package clarusway.tests.ODEVLER;

import org.testng.annotations.*;

public class ODEV_29_Aralık {
   // Create a class.
   // Create 2 test methods.
   // Use TestNG annotations that can be used in the class.
   // Interpret output in console.

    // Bir sınıf oluşturun.
    // 2 test yöntemi oluşturun.
    // Sınıfta kullanılabilecek TestNG ek açıklamalarını kullanın.
    // Çıkışı konsolda yorumla.
    @Test
    public void test01() {
        System.out.println("Test01 çalışıyor");
    }
    @Test
    public void test02() {
        System.out.println("Test02 çalışıyor");
    }
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before suit çalıştı");
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("Aftersuit çalıştı");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before test calisti");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After test calisti");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class calisti");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After class calisti");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method calisti");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After method calisti");
    }
}
