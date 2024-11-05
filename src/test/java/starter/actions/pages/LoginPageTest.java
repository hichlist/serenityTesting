package starter.actions.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl("https://unsplash.com/")
public class LoginPageTest extends PageObject {

    @FindBy(xpath = "//a[.='Log in']")
    private WebElementFacade loginLink;

    @FindBy(xpath = "//input[@name='email']")
    private WebElementFacade inputEmail;

    @FindBy(xpath = "//input[@name='password']")
    private WebElementFacade inputPass;

    @FindBy(xpath = "//button[.='Login']")
    private WebElementFacade loginButton;

    public WebElementFacade getLoginLink() {
        return loginLink;
    }

    public WebElementFacade getInputEmail() {
        return inputEmail;
    }

    public WebElementFacade getInputPass() {
        return inputPass;
    }

    public WebElementFacade getLoginButton() {
        return loginButton;
    }
}
