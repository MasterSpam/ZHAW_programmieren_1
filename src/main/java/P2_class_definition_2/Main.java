package P2_class_definition_2;

public class Main {

    public static void main(String[] args) {

        Ticket_order order1 = new Ticket_order();
        System.out.println(order1.berechnePreis(9, false));
        System.out.println(order1.berechnePreis(20, false));
        System.out.println(order1.berechnePreis(20, true));
        System.out.println(order1.berechnePreis(0, false));

        Automodell auto1 = new Automodell("Audi", "Prius", 5, true);
        auto1.changeLagerbestand(12);
        auto1.changeLagerbestand(5);
        auto1.printAuto();




    }


}
