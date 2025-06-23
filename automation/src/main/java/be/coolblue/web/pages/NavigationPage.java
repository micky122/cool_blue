package be.coolblue.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationPage extends AbstractPage {
    @FindBy(css=".coolbar-navigation--title.hide")
    WebElement accountBtnNavBar;

    @FindBy(css=".button.button--full-width.button--order.js-show-login-form")
    WebElement goToLoginBtn;

    @FindBy(css=".coolbar-navigation--drop-down-content form[method='post'] input[type=email]")
    WebElement emailAddressFld;

    @FindBy(css=".coolbar-navigation--drop-down-content form[method='post'] input[type=password]")
    WebElement passwordFld;

    @FindBy(css=".section--5 > .button.button--full-width.button--order")
    WebElement loginBtn;


    public void goToLoginNavBar() {
        accountBtnNavBar.click();
        goToLoginBtn.click();
    }

    public void fillEmailFld(String emailBarLog) {
        emailAddressFld.sendKeys(emailBarLog);
    }

    public void fillPasswordFld(String passwordBarLog) {
        passwordFld.sendKeys(passwordBarLog);
    }

    public void loginToAccount() {
        loginBtn.click();
    }

}
