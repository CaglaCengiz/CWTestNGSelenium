package clarusway.tests.ODEVLER;

import clarusway.utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ODEV_SoftAssert extends BaseTest {
 //  Test Case2: Negative Username Test
 //  Open page https://practicetestautomation.com/practice-test-login/
 //  Type username incorrectUser into Username field.
 //  Type password Password123 into Password field.
 //  Puch Submit button.
 //  Verify error message is displayed.
 //  Verify error message text is Your username is invalid!

    // Test Durumu2: Negatif Kullanıcı Adı Testi
    // Sayfayı aç https://practicetestautomation.com/practice-test-login/
    // Kullanıcı adı alanına yanlışKullanıcı yazın.
    // Şifre alanına şifre Şifre123 yazın.
    // Gönder düğmesine basın.
    // Hata mesajının görüntülendiğini doğrulayın.
    // Hata mesajı metninin Kullanıcı adınız geçersiz olduğunu doğrulayın!

    @Test
    public void test() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("incorrectUser");
        WebElement  password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("Password123");
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        WebElement error=driver.findElement(By.xpath("//div[@id='error']"));
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(error.isDisplayed());
        softAssert.assertEquals(error.getText(),"Your username is invalid!");
        softAssert.assertAll();


    }
}
