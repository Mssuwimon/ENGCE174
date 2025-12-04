import java.util.Scanner;

class Product {
    private String name;
    private static int productCount = 0;

    // Constructor
    public Product(String name) {
        this.name = name;
        productCount++;
    }

    // Get name
    public String getName() {
        return name;
    }

    // Get total product count
    public static int getProductCount() {
        return productCount;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < N; i++) {
            String productName = sc.nextLine();
            Product product = new Product(productName);
        }

        System.out.println(Product.getProductCount());
    }
}
