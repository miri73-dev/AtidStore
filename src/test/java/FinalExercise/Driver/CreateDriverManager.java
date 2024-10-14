package FinalExercise.Driver;

/**
 * CreateDriverManager is responsible for creating instances of DriverManager based on the specified driver type.
 */
public class CreateDriverManager {
    /**
     * Creates a DriverManager instance based on the provided Drivers enum.
     *
     * @param driver the type of driver to create (e.g., CHROME, FIREFOX, EDGE)
     * @return an instance of DriverManager corresponding to the specified driver
     * If the provided driver type is not supported, a ChromeDriverManager instance is returned by default.
     */
    public DriverManager CreateDriverManager(Drivers driver) {
        switch (driver) {
            case CHROME:
                return new ChromeDriverManager();
//            case FIREFOX:
//                return new FirefoxDriverManager();
//            case EDGE:
//                return new EdgeDriverManager();
            default:
                return new ChromeDriverManager();
        }
    }
}
