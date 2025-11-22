import java.util.Scanner;
public class Labb1012{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] productIDs = new int[n];
        int[] stockQuantities = new int[n];
        for (int i = 0; i < n; i++) {
            productIDs[i] = sc.nextInt();
            stockQuantities[i] = sc.nextInt();
        }
        int searchID = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (productIDs[i] == searchID) {
                System.out.println(stockQuantities[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product " + searchID + " not found");
        }
    }
}