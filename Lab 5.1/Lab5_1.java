import java.util.Scanner;

class Animal {
    protected String name;
    protected int age;

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Dog extends Animal {

    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class Lab5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dog myDog = new Dog();

        // รับค่า Input
        myDog.name = sc.nextLine();
        myDog.age = sc.nextInt();

        // แสดงผลลัพธ์ (ลำดับต้องตรง)
        myDog.makeSound();
        myDog.displayInfo();

        sc.close();
    }
}
