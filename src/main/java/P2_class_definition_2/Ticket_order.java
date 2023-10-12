package P2_class_definition_2;

public class Ticket_order {

    private float price;

    public Ticket_order(){
    }

    public float berechnePreis(int numberOfPeople, boolean children) {

        if (numberOfPeople < 1) {
            System.out.println("non valid input for number of people");
            return 0;
        } else if (numberOfPeople < 5) {
            price = numberOfPeople * 12.0f;
        } else if (numberOfPeople < 10) {
            price = numberOfPeople * 10.5f;
        } else {
            price = numberOfPeople * 9.5f;
        }

        if (children) {
            price = price/2;
        }

        return price;

    }
}
