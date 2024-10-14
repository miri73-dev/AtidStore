package Task5;

/**
 * Class to manage browser interactions.
 */
public class TestInBrowser {
    private BrowserDriver browserDriver;

    /**
     * Constructor to initialize the TestInBrowser class with a BrowserDriver instance.
     * @param browserDriver the BrowserDriver instance to be used by this class
     */
    public TestInBrowser(BrowserDriver browserDriver) {
        this.browserDriver = browserDriver;
    }

    // Starts the browser and navigates to the specified URL.
    public void start(String url) {
        browserDriver.get(url);
    }

    // Retrieves and prints the title of the current webpage.
    public void getTitle() {
        System.out.println("Title: " + browserDriver.getTitle());
    }

    // Closes the browser.
    public void close() {
        browserDriver.quit();
    }
}
