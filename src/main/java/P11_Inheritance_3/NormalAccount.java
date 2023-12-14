package P11_Inheritance_3;

public class NormalAccount extends BankAccount {
    public NormalAccount(String inhaber, int kontostand) {
        super(inhaber, kontostand);
    }

    public NormalAccount(String inhaber) {
        super(inhaber);
    }

}
