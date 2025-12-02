import java.util.InputMismatchException;
import java.util.Scanner;

public class SuwimonAreaMethod {
    public static double calculateArea(double width, double height) {
        return width * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter width: ");
            double width = sc.nextDouble();

            System.out.print("Enter height: ");
            double height = sc.nextDouble();

            double area = calculateArea(width, height);

            System.out.println("Area = " + area);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number.");
        }

        sc.close();
    }
}
