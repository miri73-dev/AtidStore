package FinalExercise.Driver;

import org.openqa.selenium.WebDriver;

/**
 * Interface for managing a WebDriver instance.
 * This interface defines methods for starting and closing the WebDriver.
 */
public interface DriverManager {
    // Closes the driver or resource.
    void close();

    // Starts the driver.
    void start();

    WebDriver getDriver();
}
