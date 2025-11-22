import java.util.Scanner;

public class Labb103 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);


        System.out.println("Please enter a number:");
        int number = sc.nextInt();


        String result = "";

        if (number % 2 == 0) {
            System.out.println("Even");
        } 

        else {
            System.out.println("Odd");
        }

       System.out.println(result);

       sc.close();
    
    }
}
