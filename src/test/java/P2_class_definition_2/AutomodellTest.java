package P2_class_definition_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutomodellTest {

    @Test
    void testNeuErstelltesAutomodellHatLagerbestandNull() {
        Automodell automodell = new Automodell("Marke", "Typ", 2.0, true);
        assertEquals(0, automodell.getLagerbestand());
    }

    @Test
    void testErhoehenDesLagerbestandsUm5() {
        Automodell automodell = new Automodell("Marke", "Typ", 2.0, true);
        automodell.changeLagerbestand(5);
        assertEquals(5, automodell.getLagerbestand());
    }

    @Test
    void testErhoehenDesLagerbestandsUm20() {
        Automodell automodell = new Automodell("Marke", "Typ", 2.0, true);
        automodell.changeLagerbestand(5);
        automodell.changeLagerbestand(20);
        assertEquals(5, automodell.getLagerbestand());
    }
}
