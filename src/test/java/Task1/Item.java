package Task1;


/**
 * The Item class represents an individual item with a name and a price.
 * This class stores the details of each item and provides access to its properties.
 */
class Item {

    private String name;
    private double price;

    /**
     * Constructs an Item with a specified name and price.
     *
     * @param name  the name of the item
     * @param price the price of the item
     */
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
    * Gets the price of the item.
    *
    * @return the price of the item
    */

    public double getPrice() {
        return price;
    }

    /**
     * Gets the name of the item.
     *
     * @return the name of the item
     */
    public String getName() {
        return name;
    }
}