package P3_object_interaction;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {



        Uhrenanzeige uhrenanzeige1 = new Uhrenanzeige();
        Uhrenanzeige uhrenanzeige2 = new Uhrenanzeige(12, 34, 59);

        System.out.println(uhrenanzeige1.gibUhrzeit());
        System.out.println(uhrenanzeige2.gibUhrzeit());
        uhrenanzeige2.taktsignalGeben();
        System.out.println(uhrenanzeige2.gibUhrzeit());

        Event event1 = new Event();
        event1.setKuenstler("Künstler1", 5000);
        event1.setVIP("VIP", 100, 100);
        event1.setLoge("Loge", 50, 200);
        event1.setParkett("Parkett", 20, 500);
        System.out.println(event1.buyTickets("VIP", 50));
        System.out.println(event1.buyTickets("Loge", 120));
        System.out.println(event1.buyTickets("Parkett", 340));
        System.out.println(event1.buyTickets("VIP", 100));
        System.out.println(event1.getInformation());



    }

}
