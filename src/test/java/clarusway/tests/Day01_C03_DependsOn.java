package clarusway.tests;

import org.testng.annotations.Test;

public class Day01_C03_DependsOn {

    //Home Page testimiz login testimize baglı oldugundan dependsOn attribute unu kullanabiliriz
    //bagımlı olunan test fail olursa bagımlı olan method ignore edilir.
    //bagımlı olan method alfabetik execution a bakılmaksızın bagımlı olunan methoddan sonra calısır
    // Coklu dependsOn kullaniminda tum bagimli olunan methodlar pass oldugu durumda bagimli method calisir

    @Test
    public void loginTest(){
        System.out.println("Login testi yapılıyor");

        
    }
    @Test
    public void registrationTest() {
        System.out.println("kayıt testi yapılıyor");
    }

    @Test(dependsOnMethods = {"registrationTest ,loginTest"})
    public void homePageTest(){
        System.out.println("Home Page yapılıyor");

    }


}
