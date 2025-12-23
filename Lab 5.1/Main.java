import java.util.Scanner;

class Animal {

    protected String name;
    protected int age;

    // แสดงชื่อและอายุของสัตว์
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Dog extends Animal {

    // แสดงเสียงร้องของสุนัข
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Dog dog = new Dog();

        dog.name = sc.nextLine();
        dog.age = sc.nextInt();

        // เรียกเสียงร้องก่อน
        dog.makeSound();

        // แล้วค่อยแสดงข้อมูล
        dog.displayInfo();

        sc.close();
    }
}
