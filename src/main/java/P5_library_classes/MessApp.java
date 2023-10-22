package P5_library_classes;

/**
 * Die Klasse MessApp steuert einen Messablauf, um die Performance des
 * Zufallszahlengenerators zu messen.
 */
public class MessApp {
  private Messkonduktor messkonduktor;
  private int  ANZAHL_MESSUNGEN = 400000;
  public int [][] finalMessResultate;

  /**
   * Fuehrt eine Messung durch.
   */
  public void messen() {
    initialisieren();
    analyseDurchfuehren();
    berechneUndDruckeMittelwerteMessreihe();
    berechneUndDruckeMittelwerteMessung();
  }

  private void initialisieren() {
    // DONE Objektsammlung und Messkonduktor erzeugen
    finalMessResultate = new int[10][20];
    messkonduktor = new Messkonduktor(ANZAHL_MESSUNGEN);
  }

  private void analyseDurchfuehren() {
    // DONE Benutzen Sie 'messkonduktor' um die Messungen durchzufuehren und in der Objektsammlung zu speichern.
    for (int i = 0; i < 10; i++) {
        finalMessResultate[i] = messkonduktor.messungenDurchfuehren(finalMessResultate[i]);
    }
  }

  private void berechneUndDruckeMittelwerteMessreihe() {
    // TODO Implementieren Sie die Methode.
    for (int i = 0; i < 10; i++) {
      int tempsum = 0;
      for (int num : finalMessResultate[i]) {
        tempsum += num;
      }
      System.out.println("Mittelwert Messreihe " + (i + 1) + ": " + tempsum / finalMessResultate[i].length + "ms");
    }
  }



  private void berechneUndDruckeMittelwerteMessung() {
    // TODO Implementieren Sie die Methode.
    for (int i = 0; i < 20; i++) {
      int tempSum = 0;
      for (int j = 0; j < 10; j++) {
        tempSum += finalMessResultate[j][i];
      }
      System.out.println("Mittelwert Messung " + (i + 1) + ": " + tempSum / 10 + "ms");
    }

  }
}