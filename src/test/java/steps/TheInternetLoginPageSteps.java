package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.theinternet.TheInternetLoginPage;
import testdata.User;
import ui.dataproviders.DataProviders;

public class TheInternetLoginPageSteps {

    TheInternetLoginPage theInternetLoginPage;
    public TheInternetLoginPageSteps(WebDriver driver){
        theInternetLoginPage = new TheInternetLoginPage(driver);
    }

    @Step("Open page url")
    public void navigate(){
        theInternetLoginPage.navigate();
    }

    @Step("Check login")
    public void checkLogin(String login, String password){
        User user = new User(login, password);
        theInternetLoginPage.login(user);
    }

    @Step("Check message")
    public void  assertErrorMessage(String errorMessage){
        Assert.assertEquals(theInternetLoginPage.getErrorMessage(), errorMessage);
    }
}
