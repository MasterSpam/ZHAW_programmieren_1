import java.util.Random;

public class Testing {

    public static void main(String[] args) {

        //        Schreiben sie ein kleines Programmstück, das im Array umsatzden
        //        maximalen Wert findet. Folgende Deklarationen sind gegeben:

        int TAGE = 7;
        int FILIALEN = 3;
        int[][] umsatz = new int[FILIALEN][TAGE];

        // Zufällige Testdaten generieren
        Random random = new Random();
        for (int filiale = 0; filiale < FILIALEN; filiale++) {
            for (int tag = 0; tag < TAGE; tag++) {
                int umsatzWert = random.nextInt(10000); // Beispiel: Zufällige Werte von 0 bis 9999
                umsatz[filiale][tag] = umsatzWert;
            }
        }

        // Hier kommt Ihr Code hin
        int max = 0;
        for (int[] ints : umsatz) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        System.out.println("Maximaler Umsatz: " + max);

        // Ausgabe der Testdaten
        for (int filiale = 0; filiale < FILIALEN; filiale++) {
            for (int tag = 0; tag < TAGE; tag++) {
                System.out.println("Filiale " + (filiale + 1) + ", Tag " + (tag + 1) + ": " + umsatz[filiale][tag]);
            }
        }

    }
}



