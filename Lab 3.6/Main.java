import java.util.Scanner;

/**
 * Simulates a secure bank account with controlled access to the bal.
 * Contains BankAccount class and a Main class to run I/O as specified by the task.
 */

class BankAccount {
    // Private attribute to prevent direct modification from outside the class
    private double bal;

    /**
     * Constructor: initialize bal. If startBal is negative, set bal to 0.
     */
    public BankAccount(double startBal) {
        if (startBal >= 0) {
            this.bal = startBal;
        } else {
            this.bal = 0.0;
        }
    }

    /**
     * Return the current bal.
     */
    public double getBalance() {
        return this.bal;
    }

    /**
     * Deposit money: only accept strictly positive amounts.
     * Prints "Deposit successful." on success or "Invalid deposit amount." otherwise.
     */
    public void deposit(double amount) {
        if (amount > 0) {
            this.bal += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    /**
     * Withdraw money: only accept strictly positive amounts.
     * If amount <= bal, withdraw and print "Withdrawal successful.".
     * If amount > bal, print "Insufficient funds.".
     * If amount <= 0, print "Invalid withdrawal amount.".
     */
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount <= this.bal) {
            this.bal -= amount;
            System.out.println("Withdrawal successful.");
        } else { // amount > bal
            System.out.println("Insufficient funds.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs in order: initial bal, deposit amount, withdrawal amount
        if (scanner.hasNextDouble()) {
            double startBal = scanner.nextDouble();
            double dep = 0.0;
            double wd = 0.0;

            if (scanner.hasNextDouble()) {
                dep = scanner.nextDouble();
            }
            if (scanner.hasNextDouble()) {
                wd = scanner.nextDouble();
            }

            BankAccount account = new BankAccount(startBal);
            account.deposit(dep);
            account.withdraw(wd);

            System.out.println("Final Balance: " + account.getBalance());
        }

        scanner.close();
    }
}
