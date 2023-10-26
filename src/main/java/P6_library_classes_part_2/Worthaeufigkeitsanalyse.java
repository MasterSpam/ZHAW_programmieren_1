package P6_library_classes_part_2;

import java.util.HashMap;
import java.util.Map;

/**
 * Zaehlt die Anzahl Vorkommnisse von Woertern ueber mehrere Zeichenketten.
 * Es lassen sich eine beliebige Anzahl an Zeichenketten uebergeben. Die
 * Statistik wird fortlaufend gefuehrt. Die Wortzaehlung laesst sich jederzeit
 * ausgeben. Die Satzeichen . , ? ! " : ; werden entfernt. Alle Buchstaben
 * werden in Kleinbuchstaben umgewandelt um beispielsweise das Wort 'die'
 * inmitten eines Satzes und das Wort 'Die' am Anfang eines Satzes als gleiches
 * Wort werten zu koennen.
 *
 * @version 1.0
 * @author XXXX
 */
public class Worthaeufigkeitsanalyse {
  // Anstelle der Map dürfen Sie auch andere Datentypen verwenden. Testen Sie auch TreeMap.
  private Map<String, Integer> woerterHaeufigkeit = new HashMap<>();
  private Map<String, Integer> buchstabenHaeufigkeit = new HashMap<>();

  /**
   * Nimmt die uebergebene Zeichenkette in die Worthaeufigkeitsanalyse auf.
   *
   * @param text zu verarbeitende Zeichenkette
   */
  public void verarbeiteText(String text) {
    // TODO Ihre Implementation
    for (String wort : text.split(" ")) {
      wort = wort.replaceAll("[.,?!\":;]", "").toLowerCase();
      if (woerterHaeufigkeit.containsKey(wort)) {
        woerterHaeufigkeit.put(wort, woerterHaeufigkeit.get(wort) + 1);
      } else {
        woerterHaeufigkeit.put(wort, 1);
      }
    }
  }

  public void verarbeiteBuchstaben(String text) {
    for (String wort : text.split(" ")) {
      wort = wort.replaceAll("[.,?!\":;]", "").toLowerCase();
      for (int i = 0; i < wort.length(); i++) {
        String myChar = String.valueOf(wort.charAt(i));
        if (buchstabenHaeufigkeit.containsKey(myChar)) {
          buchstabenHaeufigkeit.put(myChar, buchstabenHaeufigkeit.get(myChar) + 1);
        } else {
          buchstabenHaeufigkeit.put(myChar, 1);
        }

        }
      }
    }

  /**
   * Ausgabe der Worthaeufigkeitsanalyse auf der Konsole.
   */
  public void druckeStatistik() {
    for (Map.Entry<String, Integer> wortHaeufigkeit : woerterHaeufigkeit.entrySet()) {
      System.out.printf("%3d %-40s%n", wortHaeufigkeit.getValue(), wortHaeufigkeit.getKey());
    }
  }

  public void druckeStatistikWort() {
    for (Map.Entry<String, Integer> buchstabenHaeufigkeit : buchstabenHaeufigkeit.entrySet()) {
      System.out.printf("%3d %-40s%n", buchstabenHaeufigkeit.getValue(), buchstabenHaeufigkeit.getKey());
    }
  }

  public static void main(String[] args) {
    Worthaeufigkeitsanalyse hauefigkeitsanalyse = new Worthaeufigkeitsanalyse();
//    hauefigkeitsanalyse.verarbeiteText("Fritz sagt: \"Die Softwareentwicklung ist meine Leidenschaft!\"");
//    hauefigkeitsanalyse.verarbeiteText("Hans meint, er teile die Leidenschaft mit Fritz.");
//    hauefigkeitsanalyse.verarbeiteText("John fuegt hinzu, dass die Softwareentwicklung nicht nur aus Programmieren bestehe, sondern es sich dabei um einen komplexen Prozess, bestehend aus vielen kleinen Komponenten, handelt.\"");
//    hauefigkeitsanalyse.druckeStatistik();
    hauefigkeitsanalyse.verarbeiteBuchstaben("Fritz sagt: \"Die Softwareentwicklung ist meine Leidenschaft!\"");
    hauefigkeitsanalyse.verarbeiteBuchstaben("Hans meint, er teile die Leidenschaft mit Fritz.");
    hauefigkeitsanalyse.verarbeiteBuchstaben("John fuegt hinzu, dass die Softwareentwicklung nicht nur aus Programmieren bestehe, sondern es sich dabei um einen komplexen Prozess, bestehend aus vielen kleinen Komponenten, handelt.\"");

    hauefigkeitsanalyse.druckeStatistikWort();
  }
}