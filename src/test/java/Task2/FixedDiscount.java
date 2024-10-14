package Task2;

/**
 * The FixedDiscount class implements the Discount interface
 * and provides a fixed discount amount on the total price.
 *
 * In this implementation, a fixed discount of $50 is applied
 * to the total price.
 */
public class FixedDiscount implements Discount {

    /**
     * Applies a fixed discount of $50 to the total price.
     *
     * @param totalPrice The original total price before the discount.
     * @return The total price after applying the fixed discount of $50.
     */
    @Override
    public double applyDiscount(double totalPrice) {
        double discount = 50;
        return totalPrice - discount;
    }
}
