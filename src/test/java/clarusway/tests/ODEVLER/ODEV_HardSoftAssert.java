package clarusway.tests.ODEVLER;

import clarusway.utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ODEV_HardSoftAssert extends BaseTest {
  //  Test Case1: Positive Login Test
  //  Open page https://practicetestautomation.com/practice-test-login/
  //  Type username student into Username field
  //  Type password "Password123" into Password field
  //  Puch Submit button.
  //  Verify new page URL contains practicetestautomation.com/logged-in-successfully/
  //  Verify new page contains expected text ('Congratulations' or 'successfully logged in')
  //  Verify button Log out is displayed on the new page.

    // Test Case1: Pozitif Giriş Testi
    // Sayfayı aç https://practicetestautomation.com/practice-test-login/
    // Kullanıcı adı öğrenciyi Kullanıcı adı alanına yazın
    // Şifre alanına şifre Şifre123 yazın
    // Gönder düğmesine basın.
    // Yeni sayfa URL'sinin pratiktestautomation.com/logged-in-successfully/ içerdiğini doğrulayın
    // Yeni sayfanın beklenen metni içerdiğini doğrulayın ("Tebrikler" veya "başarıyla giriş yaptınız")
    // Doğrula düğmesi Oturumu kapat yeni sayfada görüntülenir.




    @Test
    public void test() {
        driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement username= driver.findElement(By.cssSelector("[id='username']"));
        username.sendKeys("student");

        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("Password123");

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        String currentUrl = driver.getCurrentUrl();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(currentUrl.contains("practicetestautomation.com/logged-in-successfully/"));


        WebElement newPage = driver.findElement(By.xpath("//div[@id='loop-container']"));
        softAssert.assertTrue(newPage.getText().contains("successfully logged in"), "alanda'successfully logged in'içermiyor");

        WebElement logOut=driver.findElement(By.linkText("Log out"));
        logOut.click();
        Assert.assertTrue(logOut.isDisplayed());


    }
}
