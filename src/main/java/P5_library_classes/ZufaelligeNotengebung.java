package P5_library_classes;

import java.util.Random;

/**
 * Simuliert Pruefungsergebnisse zum Testen der Pruefungsverwaltung.
 */
public class ZufaelligeNotengebung {

  Random random = new Random();

  /**
   * Fuehrt die Simulation aus.
   */
  public void fuehreAus() {
    Pruefungsverwaltung pruefungsverwaltung = new Pruefungsverwaltung();
    String nameBestanden = "Max Muster ";
    String nameNichtBestanden = "Felix Müller ";
    for (int i = 0; i < 3; i++) {
      double note = generiereZufaelligePruefungsnoteFuerBestanden();
      Pruefungsergebnis pruefungsergebnis = new Pruefungsergebnis(nameBestanden + "Nr." + i, note);
      pruefungsverwaltung.speichereErgebnis(pruefungsergebnis);

      note = generiereZufaelligePruefungsnoteFuerNichtBestanden();
      pruefungsverwaltung.speichereErgebnis(new Pruefungsergebnis(nameNichtBestanden + "Nr." + i, note));
    }
    pruefungsverwaltung.druckeAntworttexte();
  }

  private double generiereZufaelligePruefungsnoteFuerBestanden() {
    // TODO: Fehlenden Code hier einfuegen
    return random.nextInt(201) / 100.0 + 4;

  }

  private double generiereZufaelligePruefungsnoteFuerNichtBestanden() {
    // TODO: Fehlenden Code hier einfuegen
    return (random.nextInt(300) + 100) / 100.0;

  }

  public void fuehreAufgabe3Aus() {
    Pruefungsverwaltung verwaltung = new Pruefungsverwaltung();
    verwaltung.speichereErgebnis(new Pruefungsergebnis("Susi Muster", 5.3333));
    verwaltung.speichereErgebnis(new Pruefungsergebnis("Max Mueller", 3.74));
    verwaltung.speichereErgebnis(new Pruefungsergebnis("Heinz Moser", 4));
    verwaltung.druckeAntworttexte();
  }
}
