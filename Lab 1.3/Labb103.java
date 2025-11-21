import java.util.Scanner;

public class Labb103 {
    public static void main(String[] arge){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Pless Enter Number :");
        int number = scanner.nextInt();
        if (number %2 == 0){
          System.out.println(number +" Even");  
        }
        else{
           System.out.println(number +" Odd"); 
        }
        scanner.close();
    }
    
}

