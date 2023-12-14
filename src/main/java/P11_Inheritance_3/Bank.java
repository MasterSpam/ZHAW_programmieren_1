package P11_Inheritance_3;

// This class simulates a bank with different accounts and multiple deposits and withdrawals with different accounts.
public class Bank {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[3];
        accounts[0] = new BankAccount("Hans Muster", 20000);
        accounts[1] = new SalaryAccount("Fritz Meier", 10000, 5000);
        accounts[2] = new NumberAccounts("Peter Müller", 30000);
        for (BankAccount account : accounts) {
            account.getInformation();
        }

        System.out.println();

        accounts[0].deposit(200000);
        accounts[1].deposit(20);
        accounts[2].deposit(200);
        for (BankAccount account : accounts) {
            account.getInformation();
        }

        System.out.println();

        accounts[0].withdraw(200000);
        accounts[1].withdraw(120000);
        accounts[2].withdraw(2000);
        for (BankAccount account : accounts) {
            account.getInformation();
        }
    }
}
