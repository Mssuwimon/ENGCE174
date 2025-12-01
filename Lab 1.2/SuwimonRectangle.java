import java.util.Scanner;

public class SuwimonRectangle { 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double area = width * height;

        System.out.println("Area of the rectangle is: " + area);

        sc.close();
    }
}
