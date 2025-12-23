import java.util.Scanner;

class Animal {
    protected String name;
    protected int age;

    // เสียงของสัตว์ทั่วไป
    public void makeSound() {
        System.out.println("I am an animal.");
    }

    // แสดงชื่อและอายุของสัตว์
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Cat extends Animal {

    // เขียนทับเมธอด makeSound ของ Animal
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // รับค่าชื่อและอายุจากผู้ใช้
        String name = sc.nextLine();
        int age = sc.nextInt();

        // สร้างออบเจ็กต์ Cat
        Cat cat = new Cat();

        // กำหนดค่าให้ attribute
        cat.name = name;
        cat.age = age;

        // เรียกใช้เมธอดตามลำดับที่โจทย์กำหนด
        cat.displayInfo();
        cat.makeSound();

        sc.close();
    }
}
