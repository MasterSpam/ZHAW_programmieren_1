package P5_library_classes;

public class Main {
    public static void main(String[] args) {
        // Aufgabe 2
        // MessApp messApp = new MessApp();
        // messApp.messen();

        // Aufgabe 3
        ZufaelligeNotengebung zufaelligeNotengebung = new ZufaelligeNotengebung();
        zufaelligeNotengebung.fuehreAufgabe3Aus();
        System.out.println("\n");
        for (int i = 0; i < 10; i++) {
            zufaelligeNotengebung.fuehreAus();
            System.out.println("\n");
        }

    }
}
