import java.util.InputMismatchException;
import java.util.Scanner;

public class Suwimon8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number: ");
            int N = sc.nextInt();

            if (N <= 0) {
                System.out.println("Error: N must be a positive integer.");
            } else {
                int[] numbers = new int[N];

                for (int i = 0; i < N; i++) {
                    System.out.print("Enter number " + (i + 1) + ": ");
                    numbers[i] = sc.nextInt();
                }

                int max = numbers[0];
                for (int i = 1; i < N; i++) {
                    if (numbers[i] > max) {
                        max = numbers[i];
                    }
                }

                System.out.println("Max value = " + max);
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        }

        sc.close();
    }
}
