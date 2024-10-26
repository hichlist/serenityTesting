package starter.actions.steps;

import net.serenitybdd.annotations.Step;
import starter.actions.pages.LoginPageTest;

public class LoginPageTestSteps {
    LoginPageTest loginPageTest;

    @Step
    public void pageOpen(){
        loginPageTest.open();
    }

    @Step
    public void clickLoginBtn(){
        loginPageTest.clickLoginBtn();
    }
}
