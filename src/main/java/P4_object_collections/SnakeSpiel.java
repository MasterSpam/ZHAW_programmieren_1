package P4_object_collections;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Spielklasse des Spiels Snake.
 * <p>
 * Ziel dieses Spiels ist es alle Goldstuecke einzusammeln und
 * die Tuer zu erreichen, ohne sich selber zu beissen oder in
 * die Spielfeldbegrenzung reinzukriechen.
 */
public class SnakeSpiel {
  private Schlange schlange;
  private Tuer tuer;
  private Spielfeld spielfeld;
  private Point goldStueck;
  private boolean spielLaeuft = true;
  private Scanner scanner;
  private int anzahlGoldStuecke = 10;
  private List<Point> alleGoldStuecke = new ArrayList<>();

  public static void main(String[] args) {
    new SnakeSpiel().spielen();
  }

  /**
   * Startet das Spiel.
   */
  public void spielen() {
    scanner = new Scanner(System.in);
    anzahlGoldStuecke = setAnzahlGoldStuecke();
    spielInitialisieren();
    while (spielLaeuft) {
      zeichneSpielfeld();
      ueberpruefeSpielstatus();
      fuehreSpielzugAus();
    }
    scanner.close();
  }

  private int setAnzahlGoldStuecke() {
    System.out.println("Wie viele Goldstuecke sollen eingesammelt werden?");
    while (!scanner.hasNextInt()) {
      scanner.nextLine();
      System.out.println("Bitte geben Sie eine Zahl ein.");
    }
    return scanner.nextInt();
  }

  private void spielInitialisieren() {
    tuer = new Tuer(0, 5);
    spielfeld = new Spielfeld(40, 10);
    schlange = new Schlange(30, 2);

    if (anzahlGoldStuecke > spielfeld.gibBreite() * spielfeld.gibHoehe() -2) { // prevent more gold pieces than possible
      anzahlGoldStuecke = spielfeld.gibBreite() * spielfeld.gibHoehe() -2;
    }

    while (alleGoldStuecke.size() < anzahlGoldStuecke) { // prevent duplicate gold pieces and gold pieces on door or snake
      goldStueck = spielfeld.erzeugeZufallspunktInnerhalb();
      if (!(alleGoldStuecke.contains(goldStueck) || tuer.istAufPunkt(goldStueck) || schlange.istAufPunkt(goldStueck))) {
        alleGoldStuecke.add(goldStueck);
      }
    }
  }

  private void zeichneSpielfeld() {
    char ausgabeZeichen;
    for (int y = 0; y < spielfeld.gibHoehe(); y++) {
      for (int x = 0; x < spielfeld.gibBreite(); x++) {
        Point punkt = new Point(x, y);
        ausgabeZeichen = '.';
        if (schlange.istAufPunkt(punkt)) {
          ausgabeZeichen = '@';
        } else if (istEinGoldstueckAufPunkt(punkt)) {
          ausgabeZeichen = '$';
        } else if (tuer.istAufPunkt(punkt)) {
          ausgabeZeichen = '#';
        }
        if (schlange.istKopfAufPunkt(punkt)) {
          ausgabeZeichen = 'S';
        }
        System.out.print(ausgabeZeichen);
      }
      System.out.println();
    }
  }

  private boolean istEinGoldstueckAufPunkt(Point punkt) {
    return alleGoldStuecke.contains(punkt);
  }

  private void ueberpruefeSpielstatus() {
    if (istEinGoldstueckAufPunkt(schlange.gibPosition())) {
      alleGoldStuecke.remove(schlange.gibPosition());
      schlange.wachsen();
      System.out.println("Goldstueck eingesammelt.");
    }
    if (istVerloren()) {
      System.out.println("Verloren!");
      spielLaeuft = false;
    }
    if (istGewonnen()) {
      System.out.println("Gewonnen!");
      spielLaeuft = false;
    }
  }

  private boolean istGewonnen() {
    return alleGoldStuecke.isEmpty() &&
      tuer.istAufPunkt(schlange.gibPosition());
  }

  private boolean istVerloren() {
    return schlange.istKopfAufKoerper() ||
      !spielfeld.istPunktInSpielfeld(schlange.gibPosition());
  }

  private void fuehreSpielzugAus() {
    char eingabe = liesZeichenVonTastatur();
    schlange.bewege(eingabe);
  }

  private char liesZeichenVonTastatur() {
    char konsolenEingabe = scanner.next().charAt(0);
    return konsolenEingabe;
  }
}