package homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class hw9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number ");
            int N = sc.nextInt();

            if (N <= 0) {
                System.out.println("Error: N must be a positive integer.");
            } else {
                int[] n = new int[N];
                int s = 0;

                for (int i = 0; i < N; i++) {
                    System.out.print("Enter number  " + (i + 1) + "  ");
                    n[i] = sc.nextInt();
                    s += n[i]; 
                }

                double a = (double) s / N;

                System.out.println("Average = " + a);
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        }

        sc.close();
    }
}