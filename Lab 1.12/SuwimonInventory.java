import java.util.InputMismatchException;
import java.util.Scanner;

public class SuwimonInventory {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of products: ");
            int N = sc.nextInt();

            if (N <= 0) {
                System.out.println("Error: N must be a positive integer.");
            } else {
                int[] productIDs = new int[N];
                int[] stockQuantities = new int[N];

                for (int i = 0; i < N; i++) {
                    System.out.print("Enter Product ID for product " + (i + 1) + ": ");
                    productIDs[i] = sc.nextInt();

                    System.out.print("Enter Stock Quantity for product " + (i + 1) + ": ");
                    stockQuantities[i] = sc.nextInt();
                }

                System.out.print("Enter Product ID to search: ");
                int searchID = sc.nextInt();

                boolean found = false;
                for (int i = 0; i < N; i++) {
                    if (productIDs[i] == searchID) {
                        System.out.println("Stock Quantity = " + stockQuantities[i]);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Product " + searchID + " not found");
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers.");
        }

        sc.close();
    }
}
