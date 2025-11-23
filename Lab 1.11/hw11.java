package homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class hw11{
	   public static int sA(int[] n) {
	        int s = 0;
	        for (int N : n) {
	            s += N;
	        }
	        return s;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter number  ");
	            int N = sc.nextInt();

	            if (N <= 0) {
	                System.out.println("Error: N must be a positive integer.");
	            } else {
	                int[] numbers = new int[N];

	                for (int i = 0; i < N; i++) {
	                    System.out.print("Enter number " + (i + 1) + " ");
	                    numbers[i] = sc.nextInt();
	                }

	                int s = sA(numbers);

	                System.out.println("Sum = " + s);
	            }

	        } catch (InputMismatchException e) {
	            System.out.println("Error: Please enter a valid integer.");
	        }

	        sc.close();
	    }
	}