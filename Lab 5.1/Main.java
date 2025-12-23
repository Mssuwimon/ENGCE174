import java.util.Scanner;

// Superclass: Animal
class Animal {

    // Attribute ที่ให้ subclass เข้าถึงได้
    protected String name;
    protected int age;

    // Constructor เริ่มต้น
    // ใช้เพื่อสร้าง object Animal โดยกำหนดค่าเริ่มต้น
    public Animal() {
        this.name = "";
        this.age = 0;
    }

    // Method สำหรับกำหนดข้อมูลชื่อและอายุให้กับสัตว์
    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method สำหรับแสดงข้อมูลของสัตว์
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass: Dog สืบทอดมาจาก Animal
class Dog extends Animal {

    // Method แสดงเสียงร้องของสุนัข
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// Main class สำหรับทดสอบการทำงานของโปรแกรม
public class Main {

    public static void main(String[] args) {

        // สร้าง Scanner สำหรับรับข้อมูลจากผู้ใช้
        Scanner scanner = new Scanner(System.in);

        // รับชื่อและอายุจากคีย์บอร์ด
        String inputName = scanner.nextLine();
        int inputAge = scanner.nextInt();

        // สร้าง object ของ Dog
        Dog dog = new Dog();

        // กำหนดค่าชื่อและอายุผ่าน method ของคลาสแม่
        dog.setInfo(inputName, inputAge);

        // เรียกใช้งาน method ตามลำดับที่โจทย์กำหนด
        dog.makeSound();
        dog.displayInfo();

        // ปิด Scanner
        scanner.close();
    }
}
