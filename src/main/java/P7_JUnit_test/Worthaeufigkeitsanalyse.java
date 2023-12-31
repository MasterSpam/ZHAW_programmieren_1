package P7_JUnit_test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

/**
 * Zaehlt die Anzahl Vorkommnisse von Woertern ueber mehrere Zeichenketten. Es
 * lassen sich eine beliebige Anzahl an Zeichenketten uebergeben. Die Statistik
 * wird fortlaufend gefuehrt. Die Wortzaehlung laesst sich jederzeit ausgeben.
 * Die Satzeichen . , ? ! " : ; werden entfernt. Alle Buchstaben werden in
 * Kleinbuchstaben umgewandelt um beispielsweise das Wort 'die' inmitten eines
 * Satzes und das Wort 'Die' am Anfang eines Satzes als gleiches Wort werten zu
 * koennen.
 * 
 * @version 1.0
 * @author tebe
 */
public class Worthaeufigkeitsanalyse {

	private static HashSet<String> satzzeichen = new HashSet<String>();
	static {
		satzzeichen.add(".");
		satzzeichen.add(",");
		satzzeichen.add("?");
		satzzeichen.add("!");
		satzzeichen.add("\"");
		satzzeichen.add(":");
		satzzeichen.add(";");
	}
	private HashMap<String, Integer> woerterHaeufigkeit = new HashMap<String, Integer>();

	/**
	 * Nimmt die uebergebene Zeichenkette in die Worthaeufigkeitsanalyse auf.
	 * 
	 * @param text zu verarbeitende Zeichenkette
	 */
	public void verarbeiteText(String text) {

		if (text.trim().equals("")) {
			throw new IllegalArgumentException("Leerer Text uebergeben");
		}
		String[] woerter = text.split(" ");

		for (int i = 0; i < woerter.length; i++) {
			String wort = woerter[i].trim();
			wort = wort.toLowerCase();
			wort = entferneSatzzeichen(wort);

			if (!satzzeichen.contains(wort)) {
				if (woerterHaeufigkeit.containsKey(wort)) {
					Integer zaehler = woerterHaeufigkeit.get(wort);
					woerterHaeufigkeit.put(wort, ++zaehler);
				} else {
					woerterHaeufigkeit.put(wort, 1);
				}
			}
		}
	}

	String entferneSatzzeichen(String wort) {
		boolean satzzeichenGefunden;

		do {
			satzzeichenGefunden = false;

			for (String zeichen : satzzeichen) {
				if (wort.startsWith(zeichen)) {
					satzzeichenGefunden = true;
					wort = wort.substring(1);
				}
				if (wort.endsWith(zeichen)) {
					satzzeichenGefunden = true;
					wort = wort.substring(0, wort.length() - 1);
				}
			}
		} while (satzzeichenGefunden);

		return wort;
	}

	/**
	 * Ausgabe der Worthaeufigkeitsanalyse auf der Konsole.
	 */
	public void druckeStatistik() {
		for (Entry<String, Integer> wortHaeufigkeit : woerterHaeufigkeit
				.entrySet()) {
			System.out.println(wortHaeufigkeit.getKey() + "\t"
					+ wortHaeufigkeit.getValue());
		}
	}

	public static void main(String[] args) {
		Worthaeufigkeitsanalyse hauefigkeitsanalyse = new Worthaeufigkeitsanalyse();
		hauefigkeitsanalyse
				.verarbeiteText("Fritz sagt: \"Die Softwareentwicklung ist meine Leidenschaft!\"");
		hauefigkeitsanalyse
				.verarbeiteText("Hans meint, er teile die Leidenschaft mit Fritz.");
		hauefigkeitsanalyse
				.verarbeiteText("John fuegt hinzu, dass die Softwareentwicklung nicht nur aus Programmieren bestehe, sondern es sich dabei um einen komplexen Prozess, bestehend aus vielen kleinen Komponenten, handelt.\"");
		hauefigkeitsanalyse
				.verarbeiteText("Mein Name ist Bond. James. Bond. Wie ist denn dein Name?");
		hauefigkeitsanalyse.druckeStatistik();
	}

	public int getWoerterHaeufigkeit(String myWord) {
		return woerterHaeufigkeit.get(myWord);
	}
}