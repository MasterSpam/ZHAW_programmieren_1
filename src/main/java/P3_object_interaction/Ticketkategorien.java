package P3_object_interaction;

public class Ticketkategorien {

    private String bezeichung;
    private int preis;
    private int anzahl;
    private int ticketsCount;

    public Ticketkategorien(String bezeichung, int preis, int anzahl) {
        this.bezeichung = bezeichung;
        this.preis = preis;
        this.anzahl = anzahl;
        this.ticketsCount = 0;
    }

    public String getBezeichung() {
        return bezeichung;
    }

    public int getPreis() {
        return preis;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public int getTicketsCount() {
        return ticketsCount;
    }

    public void setTicketsCount(int ticketsCount) {
        this.ticketsCount = ticketsCount;
    }
}
