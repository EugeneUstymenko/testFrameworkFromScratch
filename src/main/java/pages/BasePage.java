package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    protected WebDriver driver;
    protected String pageUrl;
    protected WebDriverWait webDriverWait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(4));
        PageFactory.initElements(driver, this);
    }

    public void navigate() {
        driver.get(pageUrl);
    }

    protected String waitAndGetText(WebElement element) {
        webDriverWait.withTimeout(Duration.ofSeconds(4)).until(ExpectedConditions.visibilityOf(element));
        return element.getText();
    }
}
