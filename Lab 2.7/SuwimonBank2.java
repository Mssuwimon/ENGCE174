import java.util.Scanner;

class BankAccount {
    String ownerName;
    double balance;

    BankAccount(String owner, double initialBalance) {
        this.ownerName = owner;
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
        String owner = sc.nextLine();
        double initial = sc.nextDouble();
        double w1 = sc.nextDouble();
        double w2 = sc.nextDouble();

        BankAccount acc = new BankAccount(owner, initial);
        acc.withdraw(w1);
        acc.withdraw(w2);
        acc.displayBalance();
        sc.close();
    }
}
