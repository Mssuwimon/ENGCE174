import java.util.Scanner;

// Superclass
class Animal {
    protected String name;
    protected int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public void makeSound() {
        System.out.println("I am an animal.");
    }
}

// Subclass
class Cat extends Animal {

    // Constructor ของ Cat
    public Cat(String name, int age) {
        super(name, age);
    }

    // Override method
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = scanner.nextInt();

        Cat myCat = new Cat(name, age);

        myCat.displayInfo();
        myCat.makeSound();

        scanner.close();
    }
}
