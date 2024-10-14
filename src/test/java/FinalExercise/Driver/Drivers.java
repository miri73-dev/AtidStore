package FinalExercise.Driver;

/**
 * Enum representing the supported web browser drivers.
 */
public enum Drivers {
    CHROME("Chrome"),
    FIREFOX("Firefox"),
    EDGE("Edge");

    private final String driverName;

    /**
     * Constructor for the Drivers enum.
     *
     * @param displayName the display name of the driver
     */
    Drivers(String displayName) {
        this.driverName = displayName;
    }

    /**
     * Returns the display name of the browser driver.
     *
     * @return the name of the driver as a String
     */
    public String getDriverName() {
        return driverName;
    }
}