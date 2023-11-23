package P9_Klassenentwurf_2;

/**
 * Diese Klasse verarbeitet Befehle vom Typ
 * {@link Befehl Befehl} und löst die dazu 
 * passenden Aktionen aus.
 * 
 * @author tebe
 *
 */
public class Kontroller {
	/**
	 * Verarbeite einen gegebenen Befehl
	 *
	 * @param befehl Der zu verarbeitende Befehl.
	 * @return 'false', wenn ein Abbruchbefehl verarbeitet wurde
	 */
	public boolean verarbeiteBefehl(Befehl befehl) {
		boolean macheWeiter = true;
		Befehlswort befehlswort = befehl.gibBefehlswort();

		switch (befehlswort) {
			case UNBEKANNT:
				System.out.println("Ich weiss nicht, was Sie meinen...");
				break;
			case HILFE:
				System.out.println("Gueltige Befehle: "
						+ Befehlswort.gibBefehlworteAlsText());
				break;
			case GEHE:
				System.out.println("Befehl  " + befehlswort.gibBefehl() + " "
						+ befehl.gibZweitesWort() + " wird ausgefuehrt");
				break;
			case BEENDEN:
				System.out.println("Befehl " + befehlswort.gibBefehl()
						+ " wird ausgefuehrt.");
				macheWeiter = false;
				break;

			default:
				System.out.println("Befehlswort ohne zugehoerige Aktion: Abbruch.");
				macheWeiter = false;
		}
		return macheWeiter;

	}
}
