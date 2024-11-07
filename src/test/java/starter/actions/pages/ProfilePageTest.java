package starter.actions.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl("https://unsplash.com/")
public class ProfilePageTest extends PageObject {

    @FindBy(xpath = "//button[@title='Your personal menu button']")
    private WebElementFacade profileButton;

    @FindBy(xpath = "//a[@id='user-dropdown']")
    private WebElementFacade altProfileButton;

    @FindBy(xpath = "//a[.='View profile']")
    private WebElementFacade profileLink;

    @FindBy(xpath = "//a[.='Stats']")
    private WebElementFacade statsLink;

    @FindBy(xpath = "//a[.='Download history']")
    private WebElementFacade historyLink;

    @FindBy(xpath = "//a[.='Account settings']")
    private WebElementFacade settingsLink;


    public WebElementFacade getAltProfileButton() {
        return altProfileButton;
    }

    public WebElementFacade getProfileButton() {
        return profileButton;
    }

    public WebElementFacade getProfileLink() {
        return profileLink;
    }

    public WebElementFacade getStatsLink() {
        return statsLink;
    }

    public WebElementFacade getHistoryLink() {
        return historyLink;
    }

    public WebElementFacade getSettingsLink() {
        return settingsLink;
    }


}
