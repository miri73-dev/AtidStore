package FinalExercise.PageObject;

import FinalExercise.Waiting;
import com.google.gson.JsonObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This class represents the checkout page and contains methods to interact with the checkout form.
 */
public class Checkout {

    Waiting wait = new Waiting();

    @FindBy (id = "billing_first_name")
    private WebElement firstName;

    @FindBy (id = "billing_last_name")
    private WebElement lastName;

    @FindBy (id = "select2-billing_country-container")
    private WebElement selectCountry;

    @FindBy (className = "select2-search__field")
    private WebElement inputIL;

    @FindBy (id = "billing_address_1")
    private WebElement address_1;

    @FindBy (id = "billing_postcode")
    private WebElement postcode;

    @FindBy (id = "billing_city")
    private WebElement city;

    @FindBy (id = "billing_phone")
    private WebElement phone;

    @FindBy (id = "billing_email")
    private WebElement email;

    @FindBy (id = "place_order")
    private WebElement placeOrder;

    @FindBy (className = "woocommerce-error")
    private WebElement Invalid;

    /**
     * Fills out the checkout form with the provided data.
     *
     * @param data   A JsonObject containing the billing information.
     * @param driver The WebDriver instance used to interact with the web elements.
     * @throws InterruptedException If the thread is interrupted while waiting.
     */
    public void fillForm(JsonObject data, WebDriver driver) throws InterruptedException {
        firstName.sendKeys(data.get("firstName").getAsString());
        lastName.sendKeys(data.get("lastName").getAsString());
        selectCountry.click();
        inputIL.sendKeys(data.get("country").getAsString());
        inputIL.sendKeys(Keys.TAB);
        address_1.sendKeys(data.get("address_1").getAsString());
        postcode.sendKeys(data.get("postcode").getAsString());
        city.sendKeys(data.get("city").getAsString());
        phone.sendKeys(data.get("phone").getAsString());
        email.sendKeys(data.get("email").getAsString());
    }

    /**
     * Clicks the place order button to submit the checkout form.
     */
    public void clickPlaceOrder(){
        placeOrder.click();
    }

    public WebElement getInvalid(){
        wait.waitForElement(Invalid);
        return Invalid;
    }
}
