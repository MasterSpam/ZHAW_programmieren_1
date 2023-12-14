package P11_Inheritance_3;

public class BankAccount {
    protected String inhaber;
    protected int kontostand; // in Rappen
    protected int maximumOnAccount = 10000000; // in Rappen => 100000 Franken


    // with initial deposit
    public BankAccount(String inhaber, int kontostand) {
        this.inhaber = inhaber;
        if (kontostand < 0 || kontostand > maximumOnAccount) throw new IllegalArgumentException("kontostand must be positive and less than " + maximumOnAccount);
        this.kontostand = kontostand * 100;
    }

    // without initial deposit
    public BankAccount(String inhaber) {
        this.inhaber = inhaber;
        this.kontostand = 0;
    }

    public void deposit(int amount) {
        if (amount < 0) throw new IllegalArgumentException("amount must be positive");
        if (kontostand + (amount * 100) > maximumOnAccount){
            kontostand = maximumOnAccount;
        } else {
            kontostand += amount * 100;
        }
    }

    public void withdraw(int amount) {
        if (amount < 0) throw new IllegalArgumentException("amount must be positive");
        if (kontostand - (amount * 100) < 0){
            kontostand = 0;
        } else {
            kontostand -= amount * 100;
        }
    }

    public void getInformation() {
        System.out.println("Inhaber: " + inhaber + ", Kontostand: " + (kontostand / 100.0) + " CHF");
    }



}
