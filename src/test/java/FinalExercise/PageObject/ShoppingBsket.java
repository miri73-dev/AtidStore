package FinalExercise.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This class represents the shopping basket functionality in the application.
 */
public class ShoppingBsket {
    @FindBy(name = "add-to-cart")
    private WebElement buttonAddCart;

    @FindBy (xpath = "//div[@class='ast-cart-menu-wrap']//span[@class='count']")
    private WebElement countCart;

    @FindBy (xpath = "//a[@href='https://atid.store/cart-2/']")
    private WebElement viewCart;

    @FindBy (className = "checkout-button")
    private WebElement checkoutButton;

    /**
     * Clicks the button to add an item to the shopping cart.
     */
    public void addCart(){
        buttonAddCart.click();
    }

    /**
     * Retrieves the current count of items in the shopping cart.
     *
     * @return The WebElement representing the cart item count.
     */
    public WebElement GetCountCart(){
        return countCart;
    }

    /**
     * Clicks the link to view the contents of the shopping cart.
     */
    public void clickViewCart(){
        viewCart.click();
    }

    /**
     * Clicks the checkout button to proceed to the checkout process.
     */
    public void clickCheckoutButton(){
        checkoutButton.click();
    }
}
