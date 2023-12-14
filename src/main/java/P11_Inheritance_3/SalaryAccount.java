package P11_Inheritance_3;

public class SalaryAccount extends BankAccount {


    private final int overdraftLimit;

    // with initial deposit
    public SalaryAccount(String inhaber, int kontostand, int overdraftLimit) {
        super(inhaber, kontostand);
        if (overdraftLimit < 0 || overdraftLimit > 100000) throw new IllegalArgumentException("overdraftLimit must be positive and less than 100000");
        this.overdraftLimit = overdraftLimit * 100;
    }

    // without initial deposit
    public SalaryAccount(String inhaber, int overdraftLimit) {
        super(inhaber);
        if (overdraftLimit < 0 || overdraftLimit > 100000) throw new IllegalArgumentException("overdraftLimit must be positive and less than 100000");
        this.overdraftLimit = overdraftLimit * 100;
    }

    public void withdraw(int amount) {
        if (amount < 0) throw new IllegalArgumentException("amount must be positive");
        if (kontostand - (amount * 100) < -overdraftLimit){
            kontostand = -overdraftLimit;
        } else {
            kontostand -= amount * 100;
        }
    }

    public void getInformation(){
        System.out.println("Inhaber: " + inhaber + ", Kontostand: " + (kontostand / 100.0) + " CHF, Überziehungslimit: " + (overdraftLimit / 100.0) + " CHF");
    }


}
