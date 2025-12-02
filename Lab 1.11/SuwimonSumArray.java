import java.util.InputMismatchException;
import java.util.Scanner;

public class SuwimonSumArray {

    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of elements: ");
            int N = sc.nextInt();

            if (N <= 0) {
                System.out.println("Error: N must be a positive integer.");
            } else {
                int[] numbers = new int[N];

                for (int i = 0; i < N; i++) {
                    System.out.print("Enter number " + (i + 1) + ": ");
                    numbers[i] = sc.nextInt();
                }

                int sum = sumArray(numbers);
                System.out.println("Sum = " + sum);
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        }

        sc.close();
    }
}
