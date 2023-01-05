package clarusway.tests.ODEVLER;

import clarusway.utilities.BaseCrossBrowserTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ODEV_DataProvider extends BaseCrossBrowserTest {
    //Go to URL:
//https://opensource demo.orangehrmlive.com/
//Login with negative credentilas by Data Provider.
//Then assert that ‘’Invalid credentials’’ is displayed. (edited)

    // Veri Sağlayıcı tarafından negatif kimlik bilgileriyle oturum açın.
//Ardından "Geçersiz kimlik bilgileri"nin görüntülendiğini onaylayın
    @Test(

            dataProvider = "keyData"
    )
    public void test(String username, String password) {



        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement username1=driver.findElement(By.name("username"));
        username1.sendKeys(username);
        WebElement password1= driver.findElement(By.name("password"));
        password1.sendKeys(password+Keys.ENTER);
       WebElement onay=driver.findElement(By.xpath("//p[.='Invalid credentials']"));
        Assert.assertTrue(onay.isDisplayed());

    }

    @DataProvider
    public Object[][] keyData() {

        return new Object[][]{
                {"Cagla", "01"},
                {"hakan", "02"},
        };
    }
}