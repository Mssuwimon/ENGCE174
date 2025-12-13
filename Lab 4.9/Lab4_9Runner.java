import java.util.Scanner;

// คลาส ImmutableAccount
class ImmutableAccount {
    
    private final String accountId;
    private final double balance;

    // Main Constructor
    public ImmutableAccount(String accountId, double balance) {
        this.accountId = accountId;
        // การตรวจสอบยอดเงินเริ่มต้น (Validation: ถ้า balance ติดลบ ให้กำหนดเป็น 0.0)
        if (balance < 0) {
            this.balance = 0.0;
        } else {
            this.balance = balance;
        }
    }

    // Copy Constructor
    public ImmutableAccount(ImmutableAccount other) {
        this.accountId = other.accountId;
        this.balance = other.balance;
    }

    // Getter Methods
    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    // Helper Method (รวมตรรกะการฝากและถอนที่ต้อง Return Object ใหม่)
    private ImmutableAccount createNewAccountWithBalance(double newBalance) {
        // ใช้ Copy Constructor หรือ Main Constructor ก็ได้
        return new ImmutableAccount(this.accountId, newBalance);
    }
    
    // Method ทำธุรกรรม: ฝากเงิน
    public ImmutableAccount deposit(double amount) {
        if (amount > 0) {
            // สร้าง Object ใหม่ด้วยยอดเงินที่เพิ่มขึ้น
            double newBalance = this.balance + amount;
            return createNewAccountWithBalance(newBalance);
        } else {
            System.out.println("Invalid deposit amount.");
            return this;
        }
    }

    // Method ทำธุรกรรม: ถอนเงิน (ลดการซ้อนของ if/else ในโค้ดเดิม)
    public ImmutableAccount withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return this;
        }

        if (amount > this.balance) {
            System.out.println("Insufficient funds.");
            return this;
        }
        
        // ถ้าผ่านการตรวจสอบทั้งหมด: จำนวนเงิน > 0 และจำนวนเงิน <= balance
        double newBalance = this.balance - amount;
        return createNewAccountWithBalance(newBalance);
    }
    
    // Method: displayInfo()
    public void displayInfo() {
        System.out.println("ID: " + this.accountId + ", Balance: " + this.balance);
    }
}

public class Lab4_9Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // รับ Input ตามลำดับ: ID, ยอดเริ่มต้น, ฝากเงิน, ถอนเงิน
        String id = scanner.nextLine();
        double initialBalance = scanner.nextDouble();
        double depositAmount = scanner.nextDouble();
        double withdrawAmount = scanner.nextDouble();
        
        // 1. สร้างบัญชีเริ่มต้น acc1
        ImmutableAccount acc1 = new ImmutableAccount(id, initialBalance);
        
        // 2. acc2 = acc1.deposit(ฝากเงิน)
        ImmutableAccount acc2 = acc1.deposit(depositAmount);
        
        // 3. acc3 = acc2.withdraw(ถอนเงิน)
        ImmutableAccount acc3 = acc2.withdraw(withdrawAmount);

        // 4. สุดท้ายให้แสดงผล acc1.displayInfo() และ acc3.displayInfo()
        acc1.displayInfo();
        acc3.displayInfo();
        
        scanner.close();
    }
}