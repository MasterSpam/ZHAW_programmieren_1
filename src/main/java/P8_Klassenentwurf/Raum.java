package P8_Klassenentwurf;

import java.util.HashMap;

/**
 * Diese Klasse modelliert Räume in der Welt von Zuul.
 * 
 * Ein "Raum" repräsentiert einen Ort in der virtuellen Landschaft des
 * Spiels. Ein Raum ist mit anderen Räumen über Ausgänge verbunden.
 * Mögliche Ausgänge liegen im Norden, Osten, Süden und Westen.
 * Für jede Richtung hält ein Raum eine Referenz auf den 
 * benachbarten Raum.
 * 
 * @author  Michael Kölling und David J. Barnes
 * @version 31.07.2011
 */
public class Raum 
{
    private String beschreibung;
    private HashMap<String, Raum> ausgaenge;

    /**
     * Erzeuge einen Raum mit einer Beschreibung. Ein Raum
     * hat anfangs keine Ausgänge.
     * @param beschreibung enthält eine Beschreibung in der Form
     *        "in einer Küche" oder "auf einem Sportplatz".
     */
    public Raum(String beschreibung) 
    {
        this.beschreibung = beschreibung;
    }

    /**
     * Definiere die Ausgänge dieses Raums. Jede Richtung führt entweder
     * zu einem anderen Raum oder ist 'null' (kein Ausgang).
     * @param richtung Der Ausgang der Richtung.
     * @param raum Der Raum in Richtung 'richtung'.
     */
    public void setzeAusgaenge(String richtung, Raum raum) {
        if (ausgaenge == null) {
            ausgaenge = new HashMap<>();
        }
        ausgaenge.put(richtung, raum);
    }

    public Raum gibAusgang(String richtung) {
        return ausgaenge.get(richtung);
    }

    /**
     * @return die Beschreibung dieses Raums.
     */
    public String gibBeschreibung()
    {
        return beschreibung;
    }

    /**
     * Liefere eine Beschreibung der Ausgänge dieses Raumes, bespielsweise
     * "Ausgänge: north west".
     *
     * @return eine Beschreibung der verfügbaren Ausgänge
     */
    public String gibAusgaengeAlsString(){
        StringBuilder ausgangszeile = new StringBuilder("Ausgänge:");
        if (ausgaenge != null) {
            for (String richtung : ausgaenge.keySet()) {
                ausgangszeile.append(" ").append(richtung);
            }
        }
        return ausgangszeile.toString();
    }

    /**
     * Liefere eine lange Beschreibung dieses Raumes, in der Form
     *
     * Sie sind in der Küche
     * Ausgänge: north west
     *
     * @return eine lange Beschreibung dieses Raumes
     */
    public String gibLangeBeschreibung(){
        return "Sie sind " + beschreibung + ".\n" + gibAusgaengeAlsString();
    }
}


