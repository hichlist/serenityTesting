package starter.actions.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://unsplash.com/")
public class LoginPageTest extends PageObject {
    private By loginLink = By.xpath("//a[.='Log in']");
//    private By loginButtor = By.xpath("//*[@id=\"app\"]/div/div/header/nav/div[2]/div[2]/div[5]/a");
    private By inputEmail = By.xpath("//input[@name='email']");

    private By inputPass = By.xpath("//input[@name='password']");
    private By loginButton = By.xpath("//button[.='Login']");


    public LoginPageTest clickLoginLink() {
        find(loginLink).click();
        return this;
    }
    public LoginPageTest writeEmail(String login) {
        find(inputEmail).sendKeys(login);
        return this;
    }
    public LoginPageTest writePassword(String password) {
        find(inputPass).sendKeys(password);
        return this;
    }
    public LoginPageTest clickLoginBtn() {
        find(loginButton).click();
        return this;
    }

}
