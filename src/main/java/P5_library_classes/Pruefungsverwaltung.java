package P5_library_classes;

import java.util.ArrayList;

/**
 * Bietet Funktionalitaeten zum Speichern von Pruefungsergebnissen von einer
 * Vielzahl von Studenten. Aus den gespeicherten Ergebnissen lassen sich
 * personalisierte Antworttext generieren.
 */
public class Pruefungsverwaltung {

  private ArrayList<Pruefungsergebnis> allErgebnise = new ArrayList<>();

  /**
   * Speichert ein Pruefungsergebnis.
   * 
   * @param ergebnis Das Pruefungsergebnis.
   */
  public void speichereErgebnis(Pruefungsergebnis ergebnis) {
    // TODO Implementieren gemaess Aufgabenstellung
    allErgebnise.add(ergebnis);

  }

  /**
   * Gibt pro gespeichert Ergebnis einen Text auf die Konsole aus.
   * Je nachdem ob der Kandidat die Pruefung bestanden (>= 4.0) oder nicht
   * bestanden (< 4.0) hat, wird ein Text in folgendem Format ausgegeben:
   * <p>
   * Max Muster, Sie haben an der Prüfung die Note 3.0 erzielt und
   * sind somit durchgefallen!
   * <p>
   * Herzliche Gratulation Max Muster! Sie haben an der Prüfung die Note 4.5
   * erzielt und haben somit bestanden!
   */
  public void druckeAntworttexte() {
    // TODO Implementieren gemaess Aufgabenstellung
    for (Pruefungsergebnis ergebnis : allErgebnise) {
      String name = ergebnis.getStudent();
      double note = rundeAufHalbeNote(ergebnis.getNote());
      if (note < 4.0) {
        System.out.println(name + ", Sie haben an der Prüfung die Note " + note + " erzielt und sind somit durchgefallen!");
      } else {
        System.out.println("Herzliche Gratulation " + name + "! Sie haben an der Prüfung die Note " + note + " erzielt und haben somit bestanden!");
      }
    }

  }

  private double rundeAufHalbeNote(double note) {
    return Math.round(note * 2) / 2.0;
  }
}
