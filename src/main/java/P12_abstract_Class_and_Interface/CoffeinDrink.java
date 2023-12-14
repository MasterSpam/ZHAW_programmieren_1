package P12_abstract_Class_and_Interface;

public abstract class CoffeinDrink extends Drinkable {

    public final void bereiteZu() {
        kocheWasser();
        braue();
        giesseInTasse();
        fuegeZutatenHinzu();
    }

    protected void kocheWasser() {
        System.out.println("Koche Wasser");
    }

    protected abstract void braue();

    protected void giesseInTasse() {
        System.out.println("Giesse in Tasse");
    }

    protected abstract void fuegeZutatenHinzu();
}
