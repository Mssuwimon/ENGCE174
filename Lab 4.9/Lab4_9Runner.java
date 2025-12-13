import java.util.Scanner;

// ImmutableAccount class
class ImmutableAccount {

    private final String accountId;
    private final double balance;

    // Constructor
    public ImmutableAccount(String accountId, double balance) {
        this.accountId = accountId;

        if (balance < 0) {
            this.balance = 0.0;
        } else {
            this.balance = balance;
        }
    }

    // Getter
    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public ImmutableAccount deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return this;
        }

        double newBalance = balance + amount;
        return new ImmutableAccount(accountId, newBalance);
    }

    // Withdraw method
    public ImmutableAccount withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return this;
        }

        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return this;
        }

        double newBalance = balance - amount;
        return new ImmutableAccount(accountId, newBalance);
    }

    // Display info
    public void displayInfo() {
        System.out.println("ID: " + accountId + ", Balance: " + balance);
    }
}

public class Lab4_9Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String id = scanner.nextLine();
        double initialBalance = scanner.nextDouble();
        double depositAmount = scanner.nextDouble();
        double withdrawAmount = scanner.nextDouble();

        ImmutableAccount acc1 = new ImmutableAccount(id, initialBalance);
        ImmutableAccount acc2 = acc1.deposit(depositAmount);
        ImmutableAccount acc3 = acc2.withdraw(withdrawAmount);

        acc1.displayInfo();
        acc3.displayInfo();

        scanner.close();
    }
}
