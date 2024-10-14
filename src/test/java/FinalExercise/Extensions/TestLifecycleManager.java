package FinalExercise.Extensions;

import FinalExercise.Driver.CreateDriverManager;
import FinalExercise.Driver.DriverManager;
import FinalExercise.Driver.Drivers;
import org.junit.jupiter.api.extension.*;
import org.openqa.selenium.WebDriver;

/**
 * TestLifecycleManager manages the lifecycle of the WebDriver during the execution of JUnit tests.
 * It implements JUnit 5 lifecycle callbacks to initialize and close the WebDriver
 * before and after tests, respectively.
 */
public class TestLifecycleManager implements BeforeAllCallback, AfterAllCallback, BeforeEachCallback, AfterEachCallback {
    private static DriverManager driverManager;
    Drivers drivers = Drivers.FIREFOX;
    CreateDriverManager createDriverManager = new CreateDriverManager();

    /**
     * Default constructor for TestLifecycleManager.
     */
    public TestLifecycleManager() {
    }

    /**
     * Starts the WebDriver before all tests are executed.
     *
     * @param context the extension context that provides information about the current test execution
     */
    @Override
    public void beforeAll(ExtensionContext context) {
        driverManager = createDriverManager.CreateDriverManager(drivers);
        driverManager.start();
    }

    /**
     * Closes the WebDriver after all tests have been executed.
     *
     * @param context the extension context that provides information about the current test execution
     * @throws Exception if an error occurs while closing the WebDriver
     */
    @Override
    public void afterAll(ExtensionContext context) throws Exception {
        driverManager.close();
    }

    /**
     * Executed before each test. This method can be used for any setup needed before each test.
     *
     * @param context the extension context that provides information about the current test execution
     * @throws Exception if an error occurs during setup
     */
    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        System.out.println("beforeEach");
    }

    /**
     * Executed after each test. This method can be used for any teardown needed after each test.
     *
     * @param context the extension context that provides information about the current test execution
     * @throws Exception if an error occurs during teardown
     */
    @Override
    public void afterEach(ExtensionContext context) throws Exception {
        System.out.println("afterEach");
    }

    /**
     * Returns the current instance of the WebDriver.
     *
     * @return the WebDriver instance
     */
    public static WebDriver getDriver() {
        return driverManager.getDriver();
    }
}
