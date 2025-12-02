import java.util.Scanner;

class Rectangle {
    double width;
    double height;

    Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
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
        double w = sc.nextDouble();
        double h = sc.nextDouble();

        Rectangle rect = new Rectangle(w, h);
        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());
        sc.close();
    }
}
