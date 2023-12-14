package P12_abstract_Class_and_Interface;

/**
 * Diese Klasse bietet die Funktionalitaet, um einen Tee
 * zu kochen.
 * 
 * @author tebe
 */
public class Tee extends CoffeinDrink{

    @Override
    protected void braue() {
        System.out.println("Tauche Teebeutel");
    }

    @Override
    protected void fuegeZutatenHinzu() {
        System.out.println("Fuege Zitrone hinzu");
    }

}
