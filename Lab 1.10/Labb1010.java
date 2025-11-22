import java.util.Scanner;
public class Labb1010{
    public static double calculateArea(double width, double height) {
        double area = width * height;
        return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double result = calculateArea(w, h);
        System.out.println(result);
    }
}