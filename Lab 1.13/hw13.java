package homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class hw13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of rows ");
            int rows = sc.nextInt();
            System.out.print("Enter number of columns ");
            int cols = sc.nextInt();

            if (rows <= 0 || cols <= 0) {
                System.out.println("Error: Rows and Columns must be positive integers.");
                sc.close();
                return;
            }

            int[][] serverStatus = new int[rows][cols];
            System.out.println("Enter the status of each server (0=Offline, 1=Online):");

            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; ) {
                    int input = sc.nextInt();
                    if (input == 0 || input == 1) {
                        serverStatus[r][c] = input;
                        c++;  
                    } else {
                        System.out.println("Invalid input! Only 0 or 1 is allowed. Enter again:");
                    }
                }
            }

            int totalOnline = 0;
            for (int[] row : serverStatus) {
                for (int status : row) {
                    totalOnline += status;
                }
            }

            System.out.println("Number of Online servers: " + totalOnline);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers (0 or 1).");
        }

        sc.close();
    }
}