package Task4;

import org.openqa.selenium.WebDriver;

/**
 * The TestInBrowser class is responsible for managing a WebDriver instance
 * and providing functionality to start the browser, get the title of the page,
 * and close the browser. It implements the DriversGetTitle, DriverStast, and DriverClose interfaces,
 */

public class TestInBrowser implements DriversGetTitle, DriverStast, DriverClose {

    private WebDriver driver;

    /**
     * Constructor to initialize the TestInBrowser class with a WebDriver instance.
     * @param driver the WebDriver instance to be used by this class
     */
    public TestInBrowser(WebDriver driver) {
        this.driver = driver;
    }

    // Starts the browser and navigates to the specified URL.
    @Override
    public void start() {
        driver.get("https://example.com");
    }

    // Retrieves and prints the title of the current webpage.
    @Override
    public void getTitle() {
        System.out.println("Title: " + driver.getTitle());
    }

    // Closes the browser and quits the WebDriver if it is not null.
    @Override
    public void close() {
        if (driver != null){
            driver.quit();
        }
    }
}
