package Task1;
import java.util.ArrayList;

import java.util.List;

/**
 * The ShoppingCart class represents a shopping cart that holds items.
 * It provides functionality to add items to the cart and retrieve the list of items.
 */
public class ShoppingCart {
    // A list to store items in the shopping cart
    private List<Item> items = new ArrayList<>();

    /**
     * Adds an item to the shopping cart.
     *
     * @param item the item to be added to the cart
     */
    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * Retrieves the list of items in the shopping cart.
     *
     * @return a list of items currently in the cart
     */
    public List<Item> getItems() {
        return items;
    }
}