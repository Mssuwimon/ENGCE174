import java.util.Scanner;

public class Labb105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.print("Plse Enter Number :");
       int number = scanner.nextInt();

       if (number == 1){
        System.out.print("Americno");
       }
       else if(number == 2){
        System.out.print("Latte");
       }
        else if(number == 3){
        System.out.print("Espresso");
       }
        else if(number == 4){
        System.out.print("Mocha");
       }
        else {
        System.out.print("Invalid Menu");
       }
        scanner.close();


    }
}
