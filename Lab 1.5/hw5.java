package homework;

import java.util.Scanner;

public class hw5{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 = Americano");
        System.out.println("2 = Latte");
        System.out.println("3 = Espresso");
        System.out.println("4 = Mocha");
        System.out.print("Enter your menu ");

        int m = sc.nextInt();

        if (m < 1 || m > 4) {
            System.out.println("Error: Invalid Menu");
        } else if (m == 1) {
            System.out.println("Americano");
        } else if (m == 2) {
            System.out.println("Latte");
        } else if (m == 3) {
            System.out.println("Espresso");
        } else if (m == 4) {
            System.out.println("Mocha");
        }

        sc.close();
    }
}
