package P9_Klassenentwurf_2;


public class Anwendung {

    private final Parser parser = new Parser();
    private final Kontroller kontroller = new Kontroller();

    private void start() {
        Befehl befehl;
        do {
            befehl = parser.liefereBefehl();
        } while (kontroller.verarbeiteBefehl(befehl));
    }

    public static void main(String[] args) {
        Anwendung anwendung = new Anwendung();
        anwendung.start();
    }

}
