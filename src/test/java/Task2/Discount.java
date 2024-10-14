package Task2;
/**
 * The Discount interface provides a method to apply a discount
 * to a given total price.
 */

public interface Discount {
    /**
     * Applies a discount to the total price of an order.
     *
     * @param totalPrice The original total price before the discount.
     * @return The total price after the discount has been applied.
     */
    public double applyDiscount(double totalPrice);
}
