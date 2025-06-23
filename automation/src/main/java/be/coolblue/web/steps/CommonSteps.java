package be.coolblue.web.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import be.coolblue.web.support.DriverProvider;
import be.coolblue.web.support.ScenarioManager;

public class CommonSteps {

    @Before
    public void beforeScenario(Scenario scenario) {
        DriverProvider.startDriver();
        ScenarioManager.setScenario(scenario);
    }

    @After
    public void afterScenario() {
        DriverProvider.stopDriver();
    }
}
