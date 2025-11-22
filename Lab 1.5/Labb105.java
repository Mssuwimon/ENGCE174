import java.util.Scanner;

public class Labb105 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // แจ้งผู้ใช้ให้กรอกหมายเลขเมนู
        System.out.print("Please enter menu number (1-4): ");
        int menuNumber = input.nextInt();

        switch (menuNumber) {
            case 1:
                System.out.println("Americano");
                break;
            case 2:
                System.out.println("Latte");
                break;
            case 3:
                System.out.println("Espresso");
                break;
            case 4:
                System.out.println("Mocha");
                break;
            default:
                System.out.println("Invalid Menu");
                break;
        }

        input.close();
    }
}
