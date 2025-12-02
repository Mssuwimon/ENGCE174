import java.util.Scanner;

public class SuwimonMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1 = Americano");
        System.out.println("2 = Latte");
        System.out.println("3 = Espresso");
        System.out.println("4 = Mocha");
        System.out.print("Enter your menu: ");

        int menu = sc.nextInt();

        if (menu == 1) {
            System.out.println("Americano");
        } else if (menu == 2) {
            System.out.println("Latte");
        } else if (menu == 3) {
            System.out.println("Espresso");
        } else if (menu == 4) {
            System.out.println("Mocha");
        } else {
            System.out.println("Invalid Menu");
        }

        sc.close();
    }
}
