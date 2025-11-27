package stepObject;

import io.qameta.allure.Step;
import pageObject.LogInPage;

import static dataObject.LogInPageData.*;

public class LogInPageSteps extends LogInPage {
    @Step("open Men Shop")
    public LogInPageSteps closePopup(){
        popUp.click();
        return this;

    };
    @Step("go to registration page")
    public LogInPageSteps goToRegistrationPage(){
        registrationBtn.click();
        return this;
    }
    @Step("fill login page")
    public LogInPageSteps setUserNumber(){
        userFildInput.setValue(userNumber);
        return this;

    }
    @Step("password")
    public LogInPageSteps setPassWord(){
        passwordInput.setValue(userPassword);
        return this;
    }
    @Step("log in")
    public LogInPageSteps logIn(){
        logInSubmitBtn.click();
        return this;
    }
    @Step("error message")
    public LogInPageSteps getErrorMessage(){
        erorMessage.getText();
        return this;
    }


}
