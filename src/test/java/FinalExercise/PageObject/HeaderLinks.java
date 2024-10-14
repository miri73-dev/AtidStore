package FinalExercise.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This class represents the header links in the application.
 */
public class HeaderLinks extends TestBase {

    @FindBy (id = "menu-item-381")
    private WebElement home;

    @FindBy (id = "menu-item-45")
    private WebElement store;

    @FindBy (id = "menu-item-266")
    private WebElement men;

    @FindBy (id = "menu-item-267")
    private WebElement women;

    @FindBy (id = "menu-item-671")
    private WebElement accessories;

    @FindBy (id = "menu-item-828")
    private WebElement about;

    @FindBy (id = "menu-item-829")
    private WebElement contact;

    /**
     * Clicks on the accessories link in the header.
     */
    public void accessoriesClick(){
        accessories.click();
    }
}
