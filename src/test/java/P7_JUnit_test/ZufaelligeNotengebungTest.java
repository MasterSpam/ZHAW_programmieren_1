package P7_JUnit_test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZufaelligeNotengebungTest {

    private ZufaelligeNotengebung zufaelligeNotengebung;
    @BeforeEach
    void setUp() {
        zufaelligeNotengebung = new ZufaelligeNotengebung();
    }

    @Test
    void generiereZufaelligePruefungsnote() {
        for (int i = 0; i < 100; i++) {
            double note = zufaelligeNotengebung.generiereZufaelligePruefungsnote();
            assertTrue(note >= 1 && note <= 6, "Note " + note + " liegt nicht zwischen 1 und 6");
        }
    }
}