package P13_abstract_Class_and_Inheritance_2;

import java.util.Calendar;

/**
 * Diese Klasse implementiert ein Briefprogramm.
 * 
 * @author tebe
 */
public class Briefprogramm {

  /**
   * main Methode.
   * @param args Es werden keine Kommandozeilenparameter verwendet
   */
	public static void main(String[] args) {

		// Ihr Code fuer das Briefprogramm:
		// Erzeugen Sie Inhalte und Adressen und drucken Sie 
		// einen Brief sowie einen Serienbrief

		// Zunächst erzeugen wir einen Brief
		// Dazu benötigen wir einen Absender, einen Empfänger und einen Inhalt
		Adresse absender1 = new Adresse("Max", "Mustermann", "Musterstrasse", 1, 8413, "Musterstadt");
		Adresse absender2 = new Adresse("Anna", "Weiler", "Baumweg", 69, 8400, "Zürich");
		Adresse absender3 = new Adresse("Sophie", "Huber", "Rinder-pfad", 420, 8000, "Winterthur");

		Adresse empfaenger1 = new Adresse("Hans", "Müller", "Kleinstrasse", 12, 8413, "Musterstadt");
		Adresse empfaenger2 = new Adresse("Peter", "Schmid", "Steinstrasse", 99, 8400, "Zürich");
		Adresse empfaenger3 = new Adresse("Hans", "Huber", "Blubber-pfad", 100, 8000, "Winterthur");

		Inhalt inhalt1 = new Inhalt("01.01.2023","Betreff", "Sehr geehrte Damen und Herren", "Dies ist ein Testbrief");
		Inhalt inhalt2 = new Inhalt("02.10.2020","Betreff", "Sehr geehrte Damen und Herren", "Dies ist ein zweiter Testbrief");
		Inhalt inhalt3 = new Inhalt("24.06.2019","Betreff", "Sehr geehrte Damen und Herren", "Dies ist ein dritter Testbrief");

		Brief brief1 = new Brief(absender1, empfaenger1, inhalt1);
		Brief brief2 = new Brief(absender2, empfaenger2, inhalt2);
		Brief brief3 = new Brief(absender3, empfaenger3, inhalt3);

		// Nun erzeugen wir einen Briefdrucker
		// Dazu benötigen wir eine Briefdruckstrategie
		BriefdruckStrategie strategie1 = new StandardBriefdruckStrategie();
		BriefdruckStrategie strategie2 = new FensterBriefDruckStrategie();

		Briefdrucker drucker1 = new Briefdrucker(strategie1);
		Briefdrucker drucker2 = new Briefdrucker(strategie2);

		// Nun drucken wir die Briefe
		drucker1.druckeBrief(brief1);
		drucker1.druckeBrief(brief2);
		drucker1.druckeBrief(brief3);

		drucker2.druckeBrief(brief1);
		drucker2.druckeBrief(brief2);
		drucker2.druckeBrief(brief3);
	  
	}
}