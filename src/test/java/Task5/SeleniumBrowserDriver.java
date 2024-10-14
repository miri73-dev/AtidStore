package Task5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Implementation of BrowserDriver using Selenium's WebDriver.
 */
public class SeleniumBrowserDriver implements BrowserDriver {

    private WebDriver driver;

    // Initialize the WebDriver (e.g., ChromeDriver)
    public SeleniumBrowserDriver() {

        driver = new ChromeDriver();
    }

    @Override
    public void get(String url) {
        driver.get(url);
    }

    @Override
    public String getTitle() {
        return driver.getTitle();
    }

    @Override
    public void quit() {
        if (driver != null) {
            driver.quit();
        }
    }
}
