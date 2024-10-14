package FinalExercise.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * ChromeDriverManager manages the lifecycle of a Chrome WebDriver instance.
 */
public class ChromeDriverManager implements DriverManager {
    private WebDriver driver;

    /**
     * Starts the Chrome WebDriver and navigates to the specified URL.
     * The browser window is maximized upon initialization.
     */
    @Override
    public void start() {
        driver = new ChromeDriver();
        driver.get("https://atid.store/");
        driver.manage().window().maximize();
        System.out.println("WebDriver initialized");
    }

    /**
     * Returns the current instance of the WebDriver.
     *
     * @return the WebDriver instance
     */
    @Override
    public WebDriver getDriver() {
        return driver;
    }

    /**
     * Closes the Chrome WebDriver if it is currently running.
     * This method also prints a message to indicate that the WebDriver has been closed.
     */
    @Override
    public void close() {
        if (driver != null) {
            driver.quit();
            System.out.println("WebDriver closed");
        }
    }
}
