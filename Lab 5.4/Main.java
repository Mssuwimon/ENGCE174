import java.util.Scanner;

// Superclass
class Vehicle {
    protected String color;

    // Constructor ของคลาสแม่
    public Vehicle(String color) {
        this.color = color;
    }
}

// Subclass
class Car extends Vehicle {
    protected int wheels;

    // Constructor ของคลาสลูก
    public Car(String color, int wheels) {
        super(color);      // เรียก constructor ของ Vehicle
        this.wheels = wheels;
    }

    // แสดงรายละเอียดรถ
    public void displayDetails() {
        System.out.println("Color: " + color + ", Wheels: " + wheels);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับสี
        String inputColor = sc.nextLine();

        // รับจำนวนล้อ
        int inputWheels = sc.nextInt();

        // สร้างออบเจ็กต์ Car ด้วย constructor
        Car car = new Car(inputColor, inputWheels);

        // แสดงผล
        car.displayDetails();

        sc.close();
    }
}
