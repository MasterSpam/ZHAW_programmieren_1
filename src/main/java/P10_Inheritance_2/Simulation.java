package P10_Inheritance_2;

import java.util.ArrayList;
import java.util.List;

public class Simulation {
    VehicleManagement vehicleManagement;
    List<Customer> customers;

    public Simulation() {
        vehicleManagement = new VehicleManagement();
        customers = new ArrayList<>();
    }

    private void simulate() {
        createCustomers();
        createVehicles();

        System.out.printf("Inventory at the beginning:%n");
        displayVehicles();

        System.out.printf("Purchase Vehicles:%n");
        purchaseVehicles();

        System.out.printf("%nInventory at the end:%n");
        displayVehicles();
    }

    private void createCustomers() {
        customers.add(new Customer("Max Meier"));
        customers.add(new Customer("Hans Hepp"));
        customers.add(new Customer("Cool Man"));
        customers.add(new Customer("Pia Propper"));
        customers.add(new Customer("Johny Hatkohle"));
    }

    private void createVehicles() {
        createBicycles();
        createMotorcycles();
        createCars();
    }

    private void createBicycles() {
        vehicleManagement.createBicycle("Scott MTB", 1900, 6, 27);
        vehicleManagement.createBicycle("BMC Carbon", 3995, 2, 27);
        vehicleManagement.createBicycle("Pukky Kids", 330, 3, 1);
    }

    private void createMotorcycles() {
        vehicleManagement.createMotorcycle("KTM 750", 9900, 5, 115, false);
        vehicleManagement.createMotorcycle("Yamaha VMax", 25000, 3, 150, true);
        vehicleManagement.createMotorcycle("Harley Fat Boy", 20000, 6, 85, false);
    }

    private void createCars() {
        vehicleManagement.createCar("Skoda Octavia", 39800, 3, 150, 5, true);
        vehicleManagement.createCar("Ferrari Enzo", 565000, 1, 580, 2, false);
        vehicleManagement.createCar("Seat Bigfamily", 42000, 4, 145, 8, false);
    }

    private void purchaseVehicles() {
        purchaseBicycles();
        purchaseMotorcycles();
        purchaseCars();
    }

    private void purchaseBicycles() {
        vehicleManagement.buyVehicle("Not available", 2, customers.get(0));
        vehicleManagement.buyVehicle("Scott MTB", 2, customers.get(0));
        vehicleManagement.buyVehicle("Pukky Kids", 2, customers.get(1));
        vehicleManagement.buyVehicle("Pukky Kids", 2, customers.get(2));
        vehicleManagement.buyVehicle("BMC Carbon", 2, customers.get(2));
    }

    private void purchaseMotorcycles() {
        vehicleManagement.buyVehicle("Harley Fat Boy", 1, customers.get(0));
        vehicleManagement.buyVehicle("KTM 750", 3, customers.get(1));
        vehicleManagement.buyVehicle("Harley Fat Boy", 2, customers.get(2));
    }

    private void purchaseCars() {
        vehicleManagement.buyVehicle("Ferrari Enzo", 1, customers.get(4));
        vehicleManagement.buyVehicle("Seat Bigfamily", 3, customers.get(3));
        vehicleManagement.buyVehicle("Seat Bigfamily", 1, customers.get(2));
    }

    private void displayVehicles() {
        vehicleManagement.printInfo();
    }

    public static void main(String[] args) {
        (new Simulation()).simulate();
    }
}
