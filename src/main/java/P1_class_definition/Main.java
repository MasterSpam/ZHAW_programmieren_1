package P1_class_definition;


public class Main {
    public static void main(String[] args) {

        Buch book1 = new Buch("Test-Titel", 12345);
        System.out.println(book1);

        Konto konto1 = new Konto("Moritz Feuchter", 5);

        konto1.output();
        konto1.deposit(1000);
        System.out.println(konto1.getEffectiveInterestRate());
        System.out.println(konto1.getInterestRate());
        konto1.setInterestRate(10);
        System.out.println(konto1.getEffectiveInterestRate());
        konto1.withdraw(500);
        konto1.output();



            int b = 2;
            int z = 1000;
            int ai;
            String result = "";

            while (z != 0) {
                result += Integer.toHexString(z % b);
                z = z / b;
            }
            System.out.println(result);
        }
    }

