import java.util.Scanner;

// Superclass
class Animal {
    // Attributes ที่ให้ subclass เข้าถึงได้
    protected String name;
    protected int age;

    // แสดงข้อมูลสัตว์
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass
class Dog extends Animal {

    // เมธอดแสดงเสียงของสุนัข
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับชื่อ (รองรับชื่อที่มีเว้นวรรค)
        String nameInput = sc.nextLine();

        // รับอายุ
        int ageInput = sc.nextInt();

        // สร้างออบเจ็กต์ Dog
        Dog dog = new Dog();

        // กำหนดค่าให้ attribute ที่สืบทอดจาก Animal โดยตรง
        dog.name = nameInput;
        dog.age = ageInput;

        // เรียกเมธอดตามลำดับที่โจทย์กำหนด
        dog.makeSound();
        dog.displayInfo();

        sc.close();
    }
}
