package starter.acceptancetests;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import starter.actions.steps.LoginPageTestSteps;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenLoginPageTest {

    @CastMember
    Actor actor;

    @Steps
    LoginPageTestSteps steps;

    @Managed(driver = "chrome")
    WebDriver driver;

    @Test
    public void TestLoginPage() {
        steps.pageOpen();
        steps.clickLoginBtn();
    }

}
