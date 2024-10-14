package FinalExercise.PageObject;

import FinalExercise.RandomNumbers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Represents the Accessories page and provides methods to interact with its elements.
 */

public class Accessories extends TestBase {

    @FindBy (className = "woocommerce-loop-product__title")
    private List<WebElement> products;

    /**
     * Returns the list of products available on the Accessories page.
     *
     * @return List of WebElement representing the products.
     */
    public List<WebElement> getProducts(){
        return products;
    }

    private int[] randomNumbers;

    /**
     * Initializes random numbers for selecting products.
     *
     * @throws IllegalStateException if there are not enough products to select.
     */
    public void initializeRandomNumbers() {
        if (products.size() < 2) {
            throw new IllegalStateException("Not enough products to select two random ones.");
        }
        randomNumbers = RandomNumbers.getRandomNumbers(products.size(), 2);
    }
    /**
     * Clicks on the first randomly selected product.
     *
     * @throws IndexOutOfBoundsException if no products are found.
     */
    public void clickProduct1(){
        if (products.isEmpty()) {
            throw new IndexOutOfBoundsException("Products not found.");
        }
        products.get(randomNumbers[0]).click();
    }

    /**
     * Clicks on the second randomly selected product.
     *
     * @throws IndexOutOfBoundsException if no products are found.
     */
    public void clickProduct2(){
        if (products.isEmpty()) {
            throw new IndexOutOfBoundsException("Product 1 not found.");
        }
        products.get(randomNumbers[1]/2).click();
    }
}
