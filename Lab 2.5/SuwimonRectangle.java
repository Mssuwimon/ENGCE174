import java.util.Scanner;

class Rectangle {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}

public class SuwimonRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double widthInput = sc.nextDouble();
        double heightInput = sc.nextDouble();

        Rectangle rect = new Rectangle(widthInput, heightInput);

        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());

        sc.close();
    }
}
