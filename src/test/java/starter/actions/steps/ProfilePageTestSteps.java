package starter.actions.steps;

import starter.actions.pages.ProfilePageTest;

public class ProfilePageTestSteps {
    ProfilePageTest profilePageTest;

    public void checkProfile() {
        profilePageTest.getProfileButton().click();
        profilePageTest.getProfileLink().click();
    }

    public void checkStats() {
        profilePageTest.getProfileButton().click();
        profilePageTest.getStatsLink().click();
    }

    public void checkSettings() {
        if (profilePageTest.getProfileButton().isPresent()) {
            profilePageTest.getProfileButton().click();
        } else {
            profilePageTest.getAltProfileButton().click();
        };
        profilePageTest.getSettingsLink().click();
    }

    public void checkHistory() {
        profilePageTest.getProfileButton().click();
        profilePageTest.getHistoryLink().click();
    }
}
