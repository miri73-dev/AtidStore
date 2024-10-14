package Task2;

/**
 * The Order class represents an order with a total price and an applied discount.
 */
public class Order {

    private double totalPrice;
    private Discount discount;

    /**
     * Constructs an Order with a specified total price and a discount strategy.
     *
     * @param totalPrice The total price of the order before any discount.
     * @param discount   The discount strategy to be applied to the order.
     */
    public Order(double totalPrice, Discount discount) {
        this.totalPrice = totalPrice;
        this.discount = discount;
    }

    /**
     * Returns the total price of the order after applying the discount.
     *
     * @return The total price after the discount has been applied.
     */
    public double getTotalPrice() {
        return discount.applyDiscount(totalPrice);
    }
}