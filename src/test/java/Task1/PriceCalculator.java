package Task1;

import java.util.List;

/**
 * The PriceCalculator class is responsible for calculating the total price of a list of items.
 */
public class PriceCalculator {

    /**
     * Calculates the total price of the items in the given list.
     *
     * @param items the list of Item objects for which the total price is to be calculated
     * @return the total price of all items in the list
     */
    public double calculateTotalPrice(List<Item> items) {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
