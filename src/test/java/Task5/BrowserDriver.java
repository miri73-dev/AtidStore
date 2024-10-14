package Task5;

/**
 * Interface for a generic browser driver.
 */
public interface BrowserDriver {
    void get(String url);
    String getTitle();
    void quit();
}
