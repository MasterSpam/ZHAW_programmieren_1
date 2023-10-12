package P3_object_interaction;

import java.util.Objects;

public class Event {

    private Kuenstler kuenstler;
    private Ticketkategorien VIP;
    private Ticketkategorien loge;
    private Ticketkategorien parkett;

    public Event(){}

    public Event(Kuenstler kuenstler, Ticketkategorien VIP, Ticketkategorien loge, Ticketkategorien parkett){
        this.kuenstler = kuenstler;
        this.VIP = VIP;
        this.loge = loge;
        this.parkett = parkett;
    }

    public void setKuenstler(String bezeichnung, int gage){
        this.kuenstler = new Kuenstler(bezeichnung, gage);
    }

    public void setVIP(String bezeichung, int preis, int anzahl){
        this.VIP = new Ticketkategorien(bezeichung, preis, anzahl);
    }

    public void setLoge(String bezeichung, int preis, int anzahl){
        this.loge = new Ticketkategorien(bezeichung, preis, anzahl);
    }

    public void setParkett(String bezeichung, int preis, int anzahl){
        this.parkett = new Ticketkategorien(bezeichung, preis, anzahl);
    }

    public String buyTickets(String category, int anzahl) {
        Ticketkategorien tempCategory;
        if (Objects.equals(category, "VIP")){
            tempCategory = VIP;
        }
        else if (Objects.equals(category, "Loge")){
            tempCategory = loge;
        }
        else if (Objects.equals(category, "Parkett")){
            tempCategory = parkett;
        }
        else {
            return "Kategorie nicht gefunden";
        }

        if (tempCategory.getAnzahl() - tempCategory.getTicketsCount() >= anzahl){
            tempCategory.setTicketsCount(tempCategory.getTicketsCount() + anzahl);
            return "Tickets gekauft";
        }
        else {
            return "Nicht genug Tickets";
        }

    }

    public String getInformation(){
        int einnahmenVIP = this.VIP.getTicketsCount() * this.VIP.getPreis();
        int einnahmenLoge = this.loge.getTicketsCount() * this.loge.getPreis();
        int einnahmenParkett = this.parkett.getTicketsCount() * this.parkett.getPreis();

        int gesamteEinnahmen = einnahmenVIP + einnahmenLoge + einnahmenParkett;

        return "Künstler: " + this.kuenstler.getBezeichnung() + ", Gage: CHF " + this.kuenstler.getGage() + "\n" +
                "VIP-Tickets : " + this.VIP.getTicketsCount() + " von " + this.VIP.getAnzahl() +
                " verkauft, Einnahmen: CHF " + einnahmenVIP + "\n"
                + "Loge-Tickets : " + this.loge.getTicketsCount() + " von " + this.loge.getAnzahl() +
                " verkauft, Einnahmen: CHF " + einnahmenLoge + "\n" +
                "Parkett-Tickets : " + this.parkett.getTicketsCount() + " von " + this.parkett.getAnzahl() +
                " verkauft, Einnahmen: CHF " + einnahmenParkett + "\n" +
                "Gesamte Einnahmen: CHF " + gesamteEinnahmen + "\n" +
                "Gewinn: CHF " + (gesamteEinnahmen - this.kuenstler.getGage());

    }

}
