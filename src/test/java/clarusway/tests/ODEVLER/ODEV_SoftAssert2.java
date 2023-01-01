package clarusway.tests.ODEVLER;

import clarusway.utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ODEV_SoftAssert2 extends BaseTest {
 //  Test Case3: Negative Password Test
 //  Open page https://practicetestautomation.com/practice-test-login/
 //  Type username student into Username field.
 //  Type password incorrectPassword into Password field.
 //  Puch Submit button.
 //  Verify error message is displayed.
 //  Verify error message text is Your password is invalid!

// Test Durumu3: Negatif Parola Testi
    // Sayfayı aç https://practicetestautomation.com/practice-test-login/
    // Kullanıcı adı öğrenciyi Kullanıcı adı alanına yazın.
    // Şifre alanına şifre yanlışŞifre yazın.
    // Gönder düğmesine basın.
    // Hata mesajının görüntülendiğini doğrulayın.
    // Hata mesajı metninin Şifreniz geçersiz olduğunu doğrulayın!


    @Test
    public void test() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("username");
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

