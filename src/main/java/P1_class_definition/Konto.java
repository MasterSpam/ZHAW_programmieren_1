package P1_class_definition;

/**
 * The `Konto` class represents a bank account with an account owner,
 * interest rate, and balance (saldo).
 * It provides methods for depositing and withdrawing funds, as well as
 * calculating the effective interest rate based on the current balance.
 *
 * @author Moritz Feuchter
 * @version 1.0
 */

public class Konto {

    private String accountOwner;
    private int interestRate;
    private int saldo = 0;


    public Konto(String newAccountOwner, int newInterestRate) {
        accountOwner = newAccountOwner;
        interestRate = newInterestRate;
    }



    // Construct without interest rate
    public Konto(String newAccountOwner) {
        accountOwner = newAccountOwner;
        interestRate = 2;
    }



    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int newRate) {
        interestRate = newRate;
    }

    public void deposit(int amount) {
        saldo += amount;
    }

    public void withdraw(int amount) {
        saldo -= amount;
    }

    public int getEffectiveInterestRate() {
        return interestRate * saldo / 100;
    }

    public void output() {
        System.out.println("Informationen zu Konto:");
        System.out.println("Kontoinhaber: " + accountOwner);
        System.out.println("Kontostand: " + saldo);
        System.out.println("Zinssatz: " + interestRate);
    }

}
