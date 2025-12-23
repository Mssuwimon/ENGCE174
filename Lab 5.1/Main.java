import java.util.Scanner;

class Animal {

    protected String name;
    protected int age;

    public void displayInfo() {
        System.out.print("Name: ");
        System.out.print(name);
        System.out.print(", Age: ");
        System.out.println(age);
    }
}

class Dog extends Animal {

    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Dog d = new Dog();

        // อ่านข้อมูลจากคีย์บอร์ด
        String tempName = input.nextLine();
        int tempAge = input.nextInt();

        // กำหนดค่าให้ object
        d.name = tempName;
        d.age = tempAge;

        // แสดงผลตามลำดับ
        d.makeSound();
        d.displayInfo();

        input.close();
    }
}
