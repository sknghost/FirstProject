package utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.open;

public class ChromeRunner {

   @BeforeTest

    public static void setUp(){
        open("https://www.magticom.ge/");


    }

    @AfterTest
    public static void tearDown(){
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
    }
}
