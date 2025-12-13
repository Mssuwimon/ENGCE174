import java.util.Scanner;

class BankAccount {

    // Instance variable: balance of this account
    private double balance;

    // Static variable: total transactions of all accounts
    private static int totalTransactionCount = 0;

    /*
     * Constructor
     */
    public BankAccount(double initialDeposit) {

        if (initialDeposit >= 0) {
            this.balance = initialDeposit;
        } else {
            this.balance = 0;
        }

        System.out.println("Account created.");
    }

    /*
     * Deposit money
     */
    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            totalTransactionCount++;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    /*
     * Withdraw money
     */
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount.");
        }
        else if (amount > balance) {
            System.out.println("Insufficient funds.");
        }
        else {
            balance -= amount;
            totalTransactionCount++;
            System.out.println("Withdrawal successful.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static int getTotalTransactionCount() {
        return totalTransactionCount;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankAccount myAccount = null;

        int commandCount = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        for (int i = 0; i < commandCount; i++) {

            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("CREATE")) {

                double initialDeposit = scanner.nextDouble();
                scanner.nextLine();
                myAccount = new BankAccount(initialDeposit);
            }

            else if (command.equalsIgnoreCase("DEPOSIT")) {

                double amount = scanner.nextDouble();
                scanner.nextLine();

                if (myAccount == null) {
                    System.out.println("No account exists.");
                } else {
                    myAccount.deposit(amount);
                }
            }

            else if (command.equalsIgnoreCase("WITHDRAW")) {

                double amount = scanner.nextDouble();
                scanner.nextLine();

                if (myAccount == null) {
                    System.out.println("No account exists.");
                } else {
                    myAccount.withdraw(amount);
                }
            }

            else if (command.equalsIgnoreCase("STATUS")) {

                if (myAccount == null) {
                    System.out.println("No account exists.");
                } else {
                    System.out.println("Balance: " + myAccount.getBalance());
                }
            }

            else if (command.equalsIgnoreCase("GLOBAL_STATUS")) {

                System.out.println(
                    "Total Transactions: " +
                    BankAccount.getTotalTransactionCount()
                );
            }
        }

        scanner.close();
    }
}
