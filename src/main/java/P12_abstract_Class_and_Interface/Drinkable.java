package P12_abstract_Class_and_Interface;

public abstract class Drinkable {

        public void drink(){
                System.out.println("Ich trinke " + this.getClass().getSimpleName());
        };
}
