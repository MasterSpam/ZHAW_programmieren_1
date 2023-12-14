package P10_Inheritance_2;

/**
 * This class stores information about a customer.
 *
 * @author Marc Rennhard
 */
public class Customer {
    private final String name;

    /**
     * Constructor to create a customer.
     *
     * @param name The name of the customer
     */
    public Customer(String name) {
        this.name = name;
    }

    /**
     * Get information about the customer.
     *
     * @return Information about the customer
     */
    public String getInfo() {
        return name;
    }
}
