package clarusway.tests;

import clarusway.utilities.BaseCrossBrowserTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day03_C06_CrossBrowser extends BaseCrossBrowserTest {
   // cross browser testıng=web uygulamanızı farklı tarayıcılarda
    // beklendiği gibi çalışıp çalışmadığını kontrol etmeye yonelıktır

    //browser bilgisi testng.xml dosyasindan alinacagindan dolayi kod asamasinda
    // herhangi bir degisiklik goruntulenmeyecektir


    @Test
    public void crossBrowserTest() throws InterruptedException {
        driver.get("https://www.google.com/");

        Thread.sleep(3000);
        Assert.assertEquals(driver.getTitle(), "Google");
    }
}
