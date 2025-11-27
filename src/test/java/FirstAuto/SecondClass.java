package FirstAuto;

import dataObject.LogInPageData;
import org.testng.Assert;
import org.testng.annotations.*;
import stepObject.LogInPageSteps;
import utils.ChromeRunner;

import static com.codeborne.selenide.Selenide.sleep;

public class SecondClass extends ChromeRunner {
    static LogInPageSteps logInPageSteps = new LogInPageSteps();
    @Test
    public static void registration(){
        logInPageSteps
                .closePopup()
                .goToRegistrationPage()
                .setUserNumber()
                .setPassWord()
                .logIn()
                .getErrorMessage();
        //Assert.assertTrue(LogInPageSteps.erorMessage,"Error message is NOT visible!");



        Assert.assertEquals(logInPageSteps.getErrorMessage(), "Error message is NOT visible!");



        sleep(3000);
    }

}
