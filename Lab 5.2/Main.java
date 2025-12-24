import java.util.Scanner;

// Superclass
class Animal {
    protected String name;
    protected int age;

    // เมธอดสำหรับ Override
    public void makeSound() {
        System.out.println("I am an animal.");
    }

    // แสดงข้อมูล
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass
class Cat extends Animal {

    // Override เมธอด makeSound()
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับชื่อ 
        String inputName = sc.nextLine();

        // รับอายุ
        int inputAge = sc.nextInt();

        // สร้างออบเจ็กต์ Cat
        Cat cat = new Cat();

        // กำหนดค่า attribute ที่สืบทอดมา
        cat.name = inputName;
        cat.age = inputAge;

        // เรียกเมธอดตามลำดับที่โจทย์กำหนด
        cat.displayInfo();
        cat.makeSound();

        sc.close();
    }
}
