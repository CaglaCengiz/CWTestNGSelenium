package clarusway.tests.ODEVLER;

import clarusway.utilities.BaseTest;
import org.testng.annotations.Test;
//  Create tests that depend on each other
//  Create beforeClass and set up settings.
//  By creating interdependent tests;
//  First go to Facebook.
//  Then go to Google depending on Facebook,
//  Then go to Amazon depending on Google
//  Close the driver.

// Birbirine bağlı testler oluşturun
// BeforeClass oluşturun ve ayarları yapın.
// Birbirine bağlı testler oluşturarak;
// Önce Facebook'a gidin.
// Ardından Facebook'a bağlı olarak Google'a gidin,
// Ardından Google'a bağlı olarak Amazon'a gidin
// sürücüyü kapatın.
public class ODEV2_29_Aralık extends BaseTest {

    @Test
    public void facebook() {
        driver.get("https://facebook.com");

    }
    @Test(dependsOnMethods = {"facebook"})
    public void google() {
        driver.get("https://google.com");

    }

    @Test(dependsOnMethods = {"google"})
    public void amazon() {
        driver.get("https://www.amazon.com/");

    }
}
