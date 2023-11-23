package P9_Klassenentwurf_2_2;

/**
 * Diese Klasse haelt eine Aufzaehlung der akzeptierten Befehlswoerter.
 * Mit ihrer Hilfe werden eingetippte Befehle erkannt.
 *
 * @author tebe
 * @version 1.0
 */
public enum Befehlswort {

    UNBEKANNT("unbekannt"), GEHE("gehe"), HILFE("hilfe"), BEENDEN("beenden"), UMSEHEN("umsehen"), UEBERNIMM("uebernimm"), NIMM("nimm");

    private String befehl;

    private Befehlswort(String befehl) {
        this.befehl = befehl;
    }

    public String gibBefehl() {
        return befehl;
    }

    public static Befehlswort gibBefehlWort(String wort) {
        Befehlswort befehl = Befehlswort.UNBEKANNT;
        for (Befehlswort element : Befehlswort.values()) {
            if (element.befehl.equalsIgnoreCase(wort)) {
                befehl = element;
            }
        }
        return befehl;
    }

    public static String gibBefehlworteAlsText() {
        StringBuilder befehlsworte = new StringBuilder();
        for (Befehlswort element : Befehlswort.values()) {
            befehlsworte.append(element.befehl).append(" ");
        }
        return befehlsworte.toString();
    }

    public String getBefehl() {
        return befehl;
    }
}
