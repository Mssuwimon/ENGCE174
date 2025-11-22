import java.util.Scanner;

public class Labb101 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("number 1" + num1);

        System.out.println("number 2" + num2); 
      
        System.out.println("sum" + sum); 
        
        System.out.println(sum);
    }
}