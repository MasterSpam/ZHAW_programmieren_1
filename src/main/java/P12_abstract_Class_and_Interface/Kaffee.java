package P12_abstract_Class_and_Interface;

/**
 * Diese Klasse bietet die Funktionalitaet, um einen Kaffee
 * zu kochen.
 * 
 * @author tebe
 */
public class Kaffee extends CoffeinDrink{

    @Override
    protected void braue() {
        System.out.println("Braue Filterkaffee");
    }

    @Override
    protected void fuegeZutatenHinzu() {
        System.out.println("Fuege Zucker und Milch hinzu");
    }

}
