package clarusway.tests.ODEVLER;

import clarusway.utilities.BaseCrossBrowserTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ODEV_MaciPadSamsung extends BaseCrossBrowserTest {
     /*
Open the site http://opencart.abstracta.us/
Using the Search function do it with Data Provider for Mac, iPad and Samsung
Arama işlevini kullanarak bunu Mac, iPad ve Samsung için Veri Sağlayıcı ile yapın
     */
     @Test(dataProvider = "getData")
     public void opencart(String key ){
         driver.get("http://opencart.abstracta.us/");
         WebElement searchBox= driver.findElement(By.name("search"));
         searchBox.sendKeys(key+ Keys.ENTER);

     }


    public Object[][] getData(){
        return new Object[][]{
                {"Mac"},
                {"ipad"},
                {"Samsung"}
        };
}}
