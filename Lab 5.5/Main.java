import java.util.Scanner;

// Superclass
class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public double calculateArea() {
        return 0.0;
    }
}

// Subclass Circle
class Circle extends Shape {
    protected double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14159 * radius * radius;
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    protected double width;
    protected double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input สำหรับ Circle
        double radius = sc.nextDouble();

        // Input สำหรับ Rectangle
        double width = sc.nextDouble();
        double height = sc.nextDouble();

        // สร้างออบเจ็กต์
        Shape circle = new Circle("Circle", radius);
        Shape rectangle = new Rectangle("Rectangle", width, height);

        // เก็บใน array ของคลาสแม่
        Shape[] shapes = { circle, rectangle };

        // แสดงพื้นที่ของแต่ละรูปทรง
        for (Shape s : shapes) {
            System.out.println(s.calculateArea());
        }

        sc.close();
    }
}
