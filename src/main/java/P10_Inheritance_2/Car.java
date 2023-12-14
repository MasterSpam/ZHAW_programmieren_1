package P10_Inheritance_2;

import java.util.ArrayList;
import java.util.List;

/**
 * This class stores information about a car.
 *
 * @author Marc Rennhard
 */
public class Car extends MotorVehicle{

    private final int seats;
    private final boolean fourWheelDrive;

    /**
     * Constructor to create a car.
     *
     * @param model          The model
     * @param price          The price
     * @param quantity       The available quantity
     * @param power          The power in horsepower
     * @param seats          The number of seats
     * @param fourWheelDrive Whether the car has four-wheel drive
     */
    public Car(String model, int price, int quantity, int power, int seats, boolean fourWheelDrive) {
        super(model, price, quantity, power);
        this.seats = seats;
        this.fourWheelDrive = fourWheelDrive;
    }

    /**
     * Get the number of seats of the car.
     *
     * @return The number of seats
     */
    public int getSeats() {
        return seats;
    }

    /**
     * Check if the car has four-wheel drive.
     *
     * @return Whether the car has four-wheel drive (true) or not
     */
    public boolean hasFourWheelDrive() {
        return fourWheelDrive;
    }

}
