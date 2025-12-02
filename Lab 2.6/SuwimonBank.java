import java.util.Scanner;

class BankAccount {
    String ownerName;
    double balance;

    BankAccount(String owner, double initialBalance) {
        this.ownerName = owner;
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void displaySummary() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Balance: " + balance);
    }
}

public class SuwimonBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String owner = sc.nextLine();
        double initial = sc.nextDouble();
        double depositAmt = sc.nextDouble();

        BankAccount acc = new BankAccount(owner, initial);
        acc.deposit(depositAmt);
        acc.displaySummary();
        sc.close();
    }
}
