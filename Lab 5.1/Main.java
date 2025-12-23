import java.util.Scanner;

// Superclass แทนสัตว์ทั่วไป
class Animal {

    protected String name;
    protected int age;

    // Constructor ใช้กำหนดค่าเริ่มต้นให้สัตว์
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // เมธอดแสดงข้อมูลพื้นฐานของสัตว์
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // เมธอดเสียงของสัตว์ (จะถูก override)
    public void makeSound() {
        System.out.println("I am an animal.");
    }
}

// Subclass Dog สืบทอดคุณสมบัติจาก Animal
class Dog extends Animal {

    // Constructor ของ Dog เรียกใช้ constructor ของ Animal
    public Dog(String name, int age) {
        super(name, age);
    }

    // Override เมธอด makeSound เพื่อให้เหมาะกับสุนัข
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // รับค่าชื่อและอายุจากผู้ใช้
        String name = sc.nextLine();
        int age = sc.nextInt();

        // สร้างออบเจ็กต์ Dog โดยใช้ constructor
        Dog myDog = new Dog(name, age);

        // เรียกใช้เมธอดที่ถูก override
        myDog.makeSound();

        // เรียกใช้เมธอดที่สืบทอดมาจาก Animal
        myDog.displayInfo();

        sc.close();
    }
}
