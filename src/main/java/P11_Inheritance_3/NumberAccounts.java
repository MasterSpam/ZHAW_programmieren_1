package P11_Inheritance_3;

public class NumberAccounts extends BankAccount {

    private static int accountNumber = 1000;

    // with initial deposit
    public NumberAccounts(String inhaber, int kontostand) {
        super(inhaber, kontostand);
        accountNumber++;
    }

    // without initial deposit
    public NumberAccounts(String inhaber) {
        super(inhaber);
        accountNumber++;
    }

    public void getInformation(){
        System.out.println("Inhaber: " + accountNumber + ", Kontostand: " + (kontostand / 100.0) + " CHF");
    }
}
