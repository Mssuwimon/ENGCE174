package homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class hw7{
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter number ");
	            int N = sc.nextInt();

	            if (N <= 0) {
	                System.out.println("Error: N must be a positive integer.");
	            } else {
	                int s = 0;

	                for (int i = 1; i <= N; i++) {
	                    System.out.print("Enter number " + i + " " );
	                    int iN = sc.nextInt();
	                    s += iN;
	                }

	                System.out.println("Sum = " + s);
	            }

	        } catch (InputMismatchException e) {
	            System.out.println("Error: Please enter a valid integer.");
	        }

	        sc.close();
	    }
	}