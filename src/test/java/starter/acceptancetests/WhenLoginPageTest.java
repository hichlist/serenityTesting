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
import starter.actions.steps.ProfilePageTestSteps;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenLoginPageTest {

    @CastMember
    Actor actor;

    @Steps
    LoginPageTestSteps loginSteps;
    @Steps
    ProfilePageTestSteps profileSteps;

    @Managed(driver = "chrome")
    WebDriver driver;

    //Test login: test@test.com, test password: test
    private String email = "test@test.com";
    private String pass = "test";

    @Test
    public void TestLoginPage() {
        loginSteps.pageOpen();
        loginSteps.loginWebSite(email, pass);
//        profileSteps.checkProfile();
//        profileSteps.checkStats();
//        profileSteps.checkHistory();
//        profileSteps.checkSettings();
    }

    @Test
    public void TestProfilePage() {
        profileSteps.checkProfile();
        profileSteps.checkStats();
        profileSteps.checkHistory();
        profileSteps.checkSettings();
    }

}
