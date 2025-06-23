package be.coolblue.web.support;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class EventHandler implements WebDriverListener {

    @Override
    public void afterClick(WebElement element) {
        saveScreenshot(DriverProvider.getDriver());
    }

    private void saveScreenshot(WebDriver driver) {
        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        final Scenario scenario = ScenarioManager.getScenario();
        scenario.attach(scaleScreenshot(screenshot), "image/png", "screenshot");
    }

    private byte[] scaleScreenshot(byte[] screenshot) {
        try (InputStream in = new ByteArrayInputStream(screenshot)) {
            BufferedImage img = ImageIO.read(in);
            int height = img.getHeight() ; // you could divide it by 3 to make it smaller, but that's personal preference
            int width = img.getWidth() ;
            Image scaledImage = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            BufferedImage imageBuff = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            imageBuff.getGraphics().drawImage(scaledImage, 0, 0, new Color(0, 0, 0), null);
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            ImageIO.write(imageBuff, "png", buffer);
            return buffer.toByteArray();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

}
