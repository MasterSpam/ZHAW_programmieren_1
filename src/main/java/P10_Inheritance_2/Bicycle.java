package P10_Inheritance_2;


/**
 * This class stores information about a bicycle.
 *
 * @author Marc Rennhard
 */
public class Bicycle  extends Vehicle{
    private final int gears;

    /**
     * Constructor to create a bicycle.
     *
     * @param model    The model
     * @param price    The price
     * @param quantity The available quantity
     * @param gears    The number of gears
     */
    public Bicycle(String model, int price, int quantity, int gears) {
        super(model, price, quantity);
        this.gears = gears;
    }


    /**
     * Get the number of gears of the bicycle.
     *
     * @return The number of gears
     */
    public int getGears() {
        return gears;
    }

}
