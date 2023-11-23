package P7_JUnit_test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PruefungsverwaltungTest {

    private Pruefungsverwaltung pruefungsverwaltung;

    @BeforeEach
    void setUp() {
        pruefungsverwaltung = new Pruefungsverwaltung();
    }

    @Test
    void rundeAufHalbeNoteKommaNote() {
        assertEquals(4, pruefungsverwaltung.rundeAufHalbeNote(3.9), "3.9 sollte auf 4.0 gerundet werden");
    }

    @Test
    void rundeAufHalbeNoteGanzeNote() {
        assertEquals(4, pruefungsverwaltung.rundeAufHalbeNote(4), "4.0 sollte auf 4.0 gerundet werden");
    }

    @Test
    void rundeAufHalbeNoteGrenzfall24() {
        assertEquals(5, pruefungsverwaltung.rundeAufHalbeNote(5.24), "5.24 sollte auf 5.0 ABGERUNDET werden");
    }

    @Test
    void rundeAufHalbeNoteGrenzfall25() {
        assertEquals(5.5, pruefungsverwaltung.rundeAufHalbeNote(5.25), "5.25 sollte auf 5.5 AUFGERUNDET werden");
    }

    @Test
    void rundeAufHalbeNoteGrenzfall74() {
        assertEquals(4.5, pruefungsverwaltung.rundeAufHalbeNote(4.74), "4.74 sollte auf 4.5 ABGERUNDET werden");
    }

    @Test
    void rundeAufHalbeNoteGrenzfall75() {
        assertEquals(5, pruefungsverwaltung.rundeAufHalbeNote(4.75), "4.75 sollte auf 5.0 AUFGERUNDET werden");
    }

}