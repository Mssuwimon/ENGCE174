import java.util.Scanner;

public class SuwimonCheckNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        String result;
        if (num % 2 == 0) {
            result = "Even";
        } else {
            result = "Odd";
        }

        System.out.println("Result: " + result);

        input.close();
    }
}
