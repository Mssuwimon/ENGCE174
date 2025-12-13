import java.util.Scanner;

// คลาส ImmutableAccount
class ImmutableAccount {
    
    private final String accountId;
    private final double balance;

    public ImmutableAccount(String accountId, double balance) {
        this.accountId = accountId;
        if (balance < 0) {
            this.balance = 0.0;
        } else {
            this.balance = balance;
        }
    }

    public ImmutableAccount(ImmutableAccount other) {
        this.accountId = other.accountId;
        this.balance = other.balance;
    }

    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public ImmutableAccount deposit(double amount) {
        if (amount > 0) {
            return new ImmutableAccount(this.accountId, this.balance + amount);
        } else {
            System.out.println("Invalid deposit amount."); // Output ที่โจทย์ต้องการ
            return this;
        }
    }

    public ImmutableAccount withdraw(double amount) {
        if (amount > 0) {
            if (amount <= this.balance) {
                return new ImmutableAccount(this.accountId, this.balance - amount);
            } else {
                System.out.println("Insufficient funds."); // Output ที่โจทย์ต้องการ
                return this;
            }
        } else {
            System.out.println("Invalid withdrawal amount."); // Output ที่โจทย์ต้องการ
            return this;
        }
    }
    
    public void displayInfo() {
        System.out.println("ID: " + this.accountId + ", Balance: " + this.balance);
    }
}

// คลาสหลักสำหรับรันโปรแกรม
public class Lab4_9Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // รับ Input โดยไม่มีข้อความ Prompt เพื่อให้ Output สะอาดขึ้น
        // ID
        String id = scanner.nextLine();
        // ยอดเริ่มต้น
        double initialBalance = scanner.nextDouble();
        // ฝากเงิน
        double depositAmount = scanner.nextDouble();
        // ถอนเงิน
        double withdrawAmount = scanner.nextDouble();
        
        // 1. สร้างบัญชีเริ่มต้น acc1
        ImmutableAccount acc1 = new ImmutableAccount(id, initialBalance);
        
        // 2. acc2 = acc1.deposit(ฝากเงิน)
        ImmutableAccount acc2 = acc1.deposit(depositAmount);
        
        // 3. acc3 = acc2.withdraw(ถอนเงิน)
        ImmutableAccount acc3 = acc2.withdraw(withdrawAmount);

        // 4. สุดท้ายให้แสดงผล 
        acc1.displayInfo();
        
        // แสดงผลลัพธ์ของ acc3 (บัญชีสุดท้าย)
        acc3.displayInfo();
        
        scanner.close();
    }
}