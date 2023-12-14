package P10_Inheritance_2;

import java.util.ArrayList;
import java.util.List;

/**
 * This class stores information about a motorcycle.
 *
 * @author Marc Rennhard
 */
public class Motorcycle extends MotorVehicle{

    private final boolean abs;

    /**
     * Constructor to create a motorcycle.
     *
     * @param model    The model
     * @param price    The price
     * @param quantity The available quantity
     * @param power    The power in horsepower
     * @param abs      Whether the motorcycle has ABS
     */
    public Motorcycle(String model, int price, int quantity, int power, boolean abs) {
        super(model, price, quantity, power);
        this.abs = abs;
    }

    /**
     * Check if the motorcycle has ABS.
     *
     * @return Whether the motorcycle has ABS (true) or not
     */
    public boolean getAbs() {
        return abs;
    }

}
