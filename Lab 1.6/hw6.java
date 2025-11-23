package homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class hw6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number ");
            int n = sc.nextInt();

            for (int i = 1; i <= 12; i++) {
                int r = n * i;
                System.out.println(n + " x " + i + " = " + r);
            }

        } catch (InputMismatchException e) {
            System.out.println("Error : Please enter a valid integer.");
        }

        sc.close();
    }
}
