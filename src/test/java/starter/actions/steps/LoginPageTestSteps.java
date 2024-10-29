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
    public void clickLoginLink(){
        loginPageTest.clickLoginLink();
    }

    @Step
    public void writeEmail(String email){
        loginPageTest.writeEmail(email);
    }

    @Step
    public void writePassword(String pass){
        loginPageTest.writePassword(pass);
    }

    @Step
    public void clickLoginBtn(){
        loginPageTest.clickLoginBtn();
    }
}
