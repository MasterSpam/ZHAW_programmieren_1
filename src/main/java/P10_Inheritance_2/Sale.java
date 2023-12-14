package P10_Inheritance_2;

/**
 * This class stores information about a sale.
 *
 * @author Marc Rennhard
 */
public class Sale {
    private final Customer customer;
    private final int quantity;
    private final int totalPrice;

    /**
     * Constructor, creates a sale.
     *
     * @param customer   The customer
     * @param quantity   The quantity purchased
     * @param totalPrice The total price
     */
    public Sale(Customer customer, int quantity, int totalPrice) {
        this.customer = customer;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    /**
     * Return information about the sale.
     *
     * @return Information about the sale
     */
    public String getInfo() {
        return String.format("Customer: %s: %d units for a total of CHF %d", customer.getInfo(), quantity, totalPrice);
    }
}
