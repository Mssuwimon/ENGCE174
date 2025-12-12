import java.util.Scanner;

class BankAccount {
    private String ownerName;
    private double balance;

    BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class SuwimonBank2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ownerName = sc.nextLine();
        double initialBalance = sc.nextDouble();
        double withdraw1 = sc.nextDouble();
        double withdraw2 = sc.nextDouble();

        BankAccount account = new BankAccount(ownerName, initialBalance);
        account.withdraw(withdraw1);
        account.withdraw(withdraw2);
        account.displayBalance();

        sc.close();
    }
}
