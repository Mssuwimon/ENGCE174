import java.util.InputMismatchException;
import java.util.Scanner;

public class SuwimonAverage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of elements: ");
            int N = sc.nextInt();

            if (N <= 0) {
                System.out.println("Error: N must be a positive integer.");
            } else {
                int[] numbers = new int[N];
                int sum = 0;

                for (int i = 0; i < N; i++) {
                    System.out.print("Enter number " + (i + 1) + ": ");
                    numbers[i] = sc.nextInt();
                    sum += numbers[i];
                }

                double average = (double) sum / N;
                System.out.println("Average = " + average);
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        }

        sc.close();
    }
}
