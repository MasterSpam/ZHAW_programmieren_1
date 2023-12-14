package P10_Inheritance_2;

public class MotorVehicle extends Vehicle{

    private final int power;

    public MotorVehicle(String model, int price, int quantity, int power) {
        super(model, price, quantity);
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
