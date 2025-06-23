package be.coolblue.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {
    @FindAll({
            @FindBy(css = "[aria-label='Accepteer onze cookies']"),
            @FindBy(css= "[aria-label='Acceptez nos cookies']"),
            @FindBy(css = "[aria-label='Accept our cookies']")
    })
    WebElement cookieBtn;

    public void clickCookieBtn() {
        cookieBtn.click();
    }

}
