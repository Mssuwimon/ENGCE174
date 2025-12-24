import java.util.Scanner;

// Superclass
class Employee {
    protected double salary;

    // คำนวณโบนัสพื้นฐาน 10%
    public double calculateBonus() {
        return salary * 0.10;
    }
}

// Subclass
class Manager extends Employee {

    // Override เมธอดคำนวณโบนัส
    @Override
    public double calculateBonus() {
        // เรียกโบนัสพื้นฐานจากคลาสแม่
        double baseBonus = super.calculateBonus();

        // โบนัสเพิ่มพิเศษของผู้จัดการ 5%
        double extraBonus = salary * 0.05;

        return baseBonus + extraBonus;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับเงินเดือน
        double inputSalary = sc.nextDouble();

        // สร้างออบเจ็กต์ Manager
        Manager manager = new Manager();

        // กำหนดค่า salary ที่สืบทอดมา
        manager.salary = inputSalary;

        // คำนวณและแสดงโบนัส
        System.out.println(manager.calculateBonus());

        sc.close();
    }
}
