package be.coolblue.web.pages;

import be.coolblue.web.support.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AbstractPage {
    public final WebDriver driver = DriverProvider.getDriver();

    public AbstractPage() {
        PageFactory.initElements(driver, this);
    }

    protected void waitForElement(WebElement element) { //explicit wait
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(element));
    }
}
