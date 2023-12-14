package P10_Inheritance_2;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    private final String model;
    private int price;
    private int quantity;
    private List<Sale> sales = new ArrayList<>();

    public Vehicle(String model, int price, int quantity) {
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }

    public String buy(int quantityToBuy, Customer customer) {
        if (quantityToBuy <= quantity) {
            quantity -= quantityToBuy;
            Sale sale = new Sale(customer, quantityToBuy, quantityToBuy * price);
            sales.add(sale);
            return String.format("%s has purchased %d units of the model %s for a total of CHF %d", customer.getInfo(), quantityToBuy, model, (quantityToBuy * price));

        } else {
            return String.format("Unfortunately, there are only %d units of the model %s in stock", quantity, model);
        }
    }

    public String getModel() {
        return model;
    }

    public String getInfo() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Model %s, %d vehicles at a price of CHF %d in storage%n", model, quantity, price));
        result.append(String.format("Sales already made:%n"));
        for (Sale sale : sales) {
            result.append(String.format("%s%n", sale.getInfo()));
        }
        return result.toString();
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
