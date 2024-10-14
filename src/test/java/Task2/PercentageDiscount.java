package Task2;

/**
 * The PercentageDiscount class implements the Discount interface and applies
 * a percentage-based discount to the total price.
 */
public class PercentageDiscount implements Discount{

    private double percentage;

    /**
     * Constructs a PercentageDiscount with the specified discount percentage.
     *
     * @param percentage The percentage of the discount to be applied.
     */
    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    /**
     * Applies the percentage discount to the total price.
     *
     * @param totalPrice The original total price before the discount.
     * @return The total price after applying the percentage discount.
     */
    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice-(totalPrice*(percentage/100));
    }
}
