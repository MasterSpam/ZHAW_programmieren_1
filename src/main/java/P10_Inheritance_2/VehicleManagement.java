package P10_Inheritance_2;

import java.util.ArrayList;
import java.util.List;

/**
 * This class manages vehicles.
 *
 * @author Marc Rennhard
 */
public class VehicleManagement {
    private final List<Bicycle> bicycles;
    private final List<Motorcycle> motorcycles;
    private final List<Car> cars;

    private final List<Vehicle> vehicles;

    /**
     * Constructor. Creates a vehicle management system.
     */
    public VehicleManagement() {
        motorcycles = new ArrayList<>();
        cars = new ArrayList<>();
        bicycles = new ArrayList<>();
        vehicles = new ArrayList<>();
    }

    /**
     * Creates a bicycle.
     *
     * @param model    The model
     * @param price    The price
     * @param quantity The available quantity
     * @param gears    The number of gears
     */
    public void createBicycle(String model, int price, int quantity, int gears) {
        Bicycle bicycle = new Bicycle(model, price, quantity, gears);
        vehicles.add(bicycle);
    }

    /**
     * Creates a motorcycle.
     *
     * @param model       The model
     * @param price       The price
     * @param quantity    The available quantity
     * @param performance The performance
     * @param abs         Whether the motorcycle has ABS
     */
    public void createMotorcycle(String model, int price, int quantity, int performance, boolean abs) {
        Motorcycle motorcycle = new Motorcycle(model, price, quantity, performance, abs);
        vehicles.add(motorcycle);
    }

    /**
     * Creates a car.
     *
     * @param model          The model
     * @param price          The price
     * @param quantity       The available quantity
     * @param performance    The performance
     * @param seats          The number of seats
     * @param fourWheelDrive Whether the car has four-wheel drive
     */
    public void createCar(String model, int price, int quantity, int performance, int seats, boolean fourWheelDrive) {
        Car car = new Car(model, price, quantity, performance, seats, fourWheelDrive);
        vehicles.add(car);
    }

    /**
     * Purchase of any vehilce to combine the duplicated code of the three vehicles
     *
     * @param model The model
     * @param quantity The quantity
     * @param customer The customer
     */
    public void buyVehicle(String model, int quantity, Customer customer) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getModel().equals(model)) {
                String purchaseResult = vehicle.buy(quantity, customer);
                System.out.println(purchaseResult);
                return;
            }
        }
        System.out.printf("The model %s could not be found%n", model);

    }

    /**
     * Prints information about all vehicles.
     */
    public void printInfo() {
        for (Bicycle bicycle : bicycles) {
            System.out.println(bicycle.getInfo());
        }
        for (Motorcycle motorcycle : motorcycles) {
            System.out.println(motorcycle.getInfo());
        }
        for (Car car : cars) {
            System.out.println(car.getInfo());
        }
    }
}
