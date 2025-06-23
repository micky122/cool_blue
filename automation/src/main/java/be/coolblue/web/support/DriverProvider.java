package be.coolblue.web.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;

public class DriverProvider {
    private static WebDriver driver;
    public static void startDriver() {
        WebDriver localDriver;

        System.out.println(System.getProperty("browser"));
        if (System.getProperty("browser").equals("ChromeDriver")) {
            localDriver = new ChromeDriver();
        } else  {
            localDriver = new FirefoxDriver();
        }
        // EventFiringDecorator creates a wrapper around an arbitrary WebDriver instance that notifies registered listeners about events happening in this WebDriver and derived objects
        // it supports the before and after event in the CommonSteps file
        driver = new EventFiringDecorator(new EventHandler()).decorate(localDriver);
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void stopDriver() {
        driver.quit();
    }

    public static void getWebsite(String url) {
        driver.get(url);
    }
}
