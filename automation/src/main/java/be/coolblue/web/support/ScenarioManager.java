package be.coolblue.web.support;

import io.cucumber.java.Scenario;

public class ScenarioManager {
    private static Scenario scenario;

    public static Scenario getScenario() {
        return scenario;
    }

    public static void setScenario(Scenario scenario) {
        ScenarioManager.scenario = scenario;
    }
}
