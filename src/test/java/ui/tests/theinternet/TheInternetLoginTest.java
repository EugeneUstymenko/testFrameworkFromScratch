package ui.tests.theinternet;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import steps.TheInternetLoginPageSteps;
import ui.dataproviders.DataProviders;
import ui.tests.BaseTest;

@Feature("The internet login test")
public class TheInternetLoginTest extends BaseTest {

    @Description("Check validation of login and password fields")
    @Story("Check text of message")
    @Test(testName = "First test", description = "Check if the correct message appears",
            dataProvider = "user-credentials",
            dataProviderClass = DataProviders.class)
    public void messageShouldAppears(String login, String password, String errorMessage) {
        TheInternetLoginPageSteps theInternetLoginPageSteps = new TheInternetLoginPageSteps(driver);
        theInternetLoginPageSteps.navigate();
        theInternetLoginPageSteps.checkLogin(login, password);
        theInternetLoginPageSteps.assertErrorMessage(errorMessage);
    }
}