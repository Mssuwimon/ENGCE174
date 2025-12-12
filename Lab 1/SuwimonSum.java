import java.util.Scanner;

public class SuwimonSum { 
	    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();

        int sum = firstNumber + secondNumber;

        System.out.println("Sum = " + sum);

        sc.close();
    }
}
