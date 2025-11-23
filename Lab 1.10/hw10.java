package homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class hw10{
	   public static double calculateArea(double W, double H) {
	        return W * H;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter width: ");
	            double W = sc.nextDouble();

	            System.out.print("Enter height: ");
	            double H = sc.nextDouble();

	            double Area = calculateArea(W , H);

	            System.out.println("Area = " + Area);

	        } catch (InputMismatchException e) {
	            System.out.println("Error: Please enter a valid number.");
	        }

	        sc.close();
	    }
	}
