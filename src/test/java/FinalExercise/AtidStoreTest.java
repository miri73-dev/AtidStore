package FinalExercise;

import FinalExercise.Extensions.TestLifecycleManager;
import FinalExercise.PageObject.Accessories;
import FinalExercise.PageObject.Checkout;
import FinalExercise.PageObject.HeaderLinks;
import FinalExercise.PageObject.ShoppingBsket;
import FinalExercise.Read.DataReader;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

@ExtendWith(TestLifecycleManager.class)

/**
 * This class contains test cases for the Atid store application, validating the shopping experience.
 */
public class AtidStoreTest {

    WebDriver driver;
    HeaderLinks headerLinks;
    Accessories accessories;
    ShoppingBsket shoppingBsket;
    Checkout checkout;
    JsonObject data;

    /**
     * Initializes the WebDriver and page objects before each test.
     */
    @BeforeEach
    public void init() {
        driver = TestLifecycleManager.getDriver();
        headerLinks = PageFactory.initElements(driver, HeaderLinks.class);
        accessories = PageFactory.initElements(driver, Accessories.class);
        shoppingBsket = PageFactory.initElements(driver, ShoppingBsket.class);
        checkout = PageFactory.initElements(driver, Checkout.class);
        data = DataReader.readData("FormFilling.json");
    }

    /**
     * Tests the complete shopping experience from selecting accessories to checking out.
     *
     * @throws InterruptedException If the thread is interrupted while waiting.
     */
    @Test
    public void test() throws InterruptedException {
        // כניסה לאקססוריז
        headerLinks.accessoriesClick();
        // אתחול מערך המספרים הרנדומליים
        accessories.initializeRandomNumbers();
        // בחירת מוצר 1
        accessories.clickProduct1();
        // הוספת המוצר לסל קניות
        shoppingBsket.addCart();
        // בדיקה שהסל התעדכן
        Assertions.assertEquals(shoppingBsket.GetCountCart().getText(), "1");
        // חזרה לדף המוצרים
        driver.navigate().back();
        // בחירת מוצר שני
        accessories.clickProduct2();
        // הוספת המוצר לסל קניות
        shoppingBsket.addCart();
        // בדיקה שהסל התעדכן
        Assertions.assertEquals(shoppingBsket.GetCountCart().getText(), "2");

        // צפיה בעגלה
        shoppingBsket.clickViewCart();
        // מעבר לתשלום
        shoppingBsket.clickCheckoutButton();
        Thread.sleep(3000);
        // מילוי הטופס
        checkout.fillForm(data, driver);
        // שליחת הטופס
        checkout.clickPlaceOrder();
        // בדיקה האם הטופס נשלח
        Assertions.assertTrue(checkout.getInvalid().isDisplayed());
    }
}