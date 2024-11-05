package starter.actions.steps;

import net.serenitybdd.annotations.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import starter.actions.pages.LoginPageTest;

public class LoginPageTestSteps {
    private static final Logger log = LoggerFactory.getLogger(LoginPageTestSteps.class);
    LoginPageTest loginPageTest;

    @Step
    public void pageOpen(){
        loginPageTest.open();
    }

    @Step
    public void clickLoginLink(String email, String pass){
        loginPageTest.getLoginLink().click();
        loginPageTest.getInputEmail().sendKeys(email);
        loginPageTest.getInputPass().sendKeys(pass);
        loginPageTest.getLoginButton().click();
    }
}
