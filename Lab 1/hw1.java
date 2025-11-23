package homework;

import java.util.Scanner;

public class hw1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number ");
		int n1 = sc.nextInt();
		
		System.out.print("Enter number ");
		int n2 = sc.nextInt();
		
		int sum = n1 + n2;
		System.out.print("is you number :"+ n1 + "\n" +"it you number :" +n2 + "\n" + "sum :" + sum );
		}
}