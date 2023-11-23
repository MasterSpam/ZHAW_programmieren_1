package P7_JUnit_test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class WorthaeufigkeitsanalyseTest {

    private Worthaeufigkeitsanalyse worthaeufigkeitsanalyse; // Declare the variable at the class level

    @BeforeEach
    void setUp() {
        worthaeufigkeitsanalyse = new Worthaeufigkeitsanalyse();
    }

    @Test
    void entferneSatzzeichenAnfangWort() {
        String wort = ".,?!\":;Hallo";
        String result = worthaeufigkeitsanalyse.entferneSatzzeichen(wort);
        assertEquals("Hallo", result, "Satzzeichen am Anfang des Wortes nicht entfernt");
    }

    @Test
    void entferneSatzzeichenEndeWort() {
        String wort = "Hallo.,?!\":;";
        String result = worthaeufigkeitsanalyse.entferneSatzzeichen(wort);
        assertEquals("Hallo", result, "Satzzeichen am Ende des Wortes nicht entfernt");
    }

    @Test
    void entferneSatzzeichenAnfangUndEndeWort() {
        String wort = ".,?!\":;Hallo.,?!\":;";
        String result = worthaeufigkeitsanalyse.entferneSatzzeichen(wort);
        assertEquals("Hallo", result, "Satzzeichen am Anfang und Ende des Wortes nicht entfernt");
    }

    @Test
    void bleibendeSatzzeichenMitte() {
        String wort = "Hallo.,?!\":;Hallo";
        String result = worthaeufigkeitsanalyse.entferneSatzzeichen(wort);
        assertEquals("Hallo.,?!\":;Hallo", result, "Satzzeichen in der Mitte des Wortes entfernt");
    }

    @Test
    void verarbeiteTextHigherLowerCase() {
        String text = "Hallo Hallo hallo HALLO";
        worthaeufigkeitsanalyse.verarbeiteText(text);
        assertEquals(4, worthaeufigkeitsanalyse.getWoerterHaeufigkeit("hallo"), "Wort nicht korrekt gezaehlt");
    }

    @Test
    void verarbeiteTextSatzzeichen() {
        String text = "Hallo, Hallo! Hallo? Hallo: Hallo; Hallo.";
        worthaeufigkeitsanalyse.verarbeiteText(text);
        assertEquals(6, worthaeufigkeitsanalyse.getWoerterHaeufigkeit("hallo"), "Wort mit Satzzeichen nicht korrekt gezaehlt");
    }

    @Test
    void verarbeiteSatz(){
        String text = "Mein Name ist Bond. James. Bond. Wie ist denn dein Name?";
        worthaeufigkeitsanalyse.verarbeiteText(text);
        assertEquals(1, worthaeufigkeitsanalyse.getWoerterHaeufigkeit("mein"), "Wort Mein nicht korrekt gezaehlt");
        assertEquals(2, worthaeufigkeitsanalyse.getWoerterHaeufigkeit("name"), "Wort Name nicht korrekt gezaehlt");
        assertEquals(2, worthaeufigkeitsanalyse.getWoerterHaeufigkeit("ist"), "Wort ist nicht korrekt gezaehlt");
        assertEquals(2, worthaeufigkeitsanalyse.getWoerterHaeufigkeit("bond"), "Wort Bond nicht korrekt gezaehlt");
        assertEquals(1, worthaeufigkeitsanalyse.getWoerterHaeufigkeit("james"), "Wort James nicht korrekt gezaehlt");
        assertEquals(1, worthaeufigkeitsanalyse.getWoerterHaeufigkeit("wie"), "Wort Wie nicht korrekt gezaehlt");
        assertEquals(1, worthaeufigkeitsanalyse.getWoerterHaeufigkeit("denn"), "Wort denn nicht korrekt gezaehlt");
        assertEquals(1, worthaeufigkeitsanalyse.getWoerterHaeufigkeit("dein"), "Wort dein nicht korrekt gezaehlt");
    }

    @Test
    void verarbeiteLeerenSatzAssertion(){
        String text = "";
        assertThrows(IllegalArgumentException.class, () -> worthaeufigkeitsanalyse.verarbeiteText(text), "Leerer Text nicht korrekt abgefangen");
    }

    @Test
    void verarbeiteLeerenSatzLeerzeichenTabAssertion(){
        String text = "   ";
        assertThrows(IllegalArgumentException.class, () -> worthaeufigkeitsanalyse.verarbeiteText(text), "Leerer Text nicht korrekt abgefangen");
    }
}