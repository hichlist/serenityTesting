package starter.actions.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://unsplash.com/")
public class LoginPageTest extends PageObject {
//    private By loginButtor = By.xpath("//a[.='Log in']");
    private By loginButtor = By.xpath("//*[@id=\"app\"]/div/div/header/nav/div[2]/div[2]/div[5]/a");


    public LoginPageTest clickLoginBtn() {
        find(loginButtor).click();
        return this;
    }
}
