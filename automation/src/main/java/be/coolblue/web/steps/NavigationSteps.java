package be.coolblue.web.steps;

import be.coolblue.web.pages.NavigationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class NavigationSteps {
    NavigationPage navigationPage = new NavigationPage();

    @When("I go to the login field in the account section of the navigation bar")
    public void iClickOnTheAccountSectionInTheNavigationBar() {
        navigationPage.goToLoginNavBar();
    }

    @Given("I login in with my account information")
    public void iLoginInWithMyAccountInformation() {
        navigationPage.fillEmailFld("test@test.be");
        navigationPage.fillPasswordFld("test123");
        navigationPage.loginToAccount();
    }

}
