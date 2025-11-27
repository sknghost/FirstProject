package pageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LogInPage {

  public static    SelenideElement
          erorMessage = $(byText("მომხმარებელი ან პაროლი არასწორია")),
          passwordInput = $(byName("password")),
          userFildInput = $(byName("subscriber")),
          logInSubmitBtn = $("button.login-submit"),
          registrationBtn = $(by("data-speech","MYMAGTI")),
          popUp = $(".gray-bg");

}
