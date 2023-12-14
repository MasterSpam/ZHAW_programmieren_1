package P12_abstract_Class_and_Interface;

import java.util.ArrayList;

public class DrinkMaker {
    public static void main(String[] args) {

        // List with multiple drinks
        ArrayList<CoffeinDrink> drinks = new ArrayList<>();
        drinks.add(new Kaffee());
        drinks.add(new Tee());

        // Prepare all drinks
        for (CoffeinDrink drink : drinks) {
            drink.bereiteZu();
            drink.drink();
            System.out.println();
        }
    }
}
