package be.coolblue.web.steps;

import be.coolblue.web.pages.HomePage;
import be.coolblue.web.support.DriverProvider;
import io.cucumber.java.en.Given;

public class HomeSteps {

    @Given("I go to the home page")
    public void goToWebsite() {
        DriverProvider.getWebsite("https://www.coolblue.be/nl");
    }

    @Given("I accept the cookies")
    public void iAcceptTheCookies() {
        HomePage homePage = new HomePage();
        homePage.clickCookieBtn();
    }

}
