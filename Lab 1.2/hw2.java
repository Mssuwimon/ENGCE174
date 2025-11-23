package homework;

import java.util.Scanner;

public class hw2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Enter number ");
		double n1 = sc.nextDouble();
		
		System.out.print("Enter number ");
		double n2 = sc.nextDouble();
		
		double Ra = n1 * n2;
		
        System.out.println("Value of rectangle area: " + Ra);
        
	}
}