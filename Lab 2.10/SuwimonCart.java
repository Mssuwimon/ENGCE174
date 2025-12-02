import java.util.Scanner;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class ShoppingCart {
    Product[] items = new Product[10];
    int itemCount = 0;

    void addProduct(Product p) {
        items[itemCount] = p;
        itemCount++;
    }

    double calculateTotalPrice() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].price;
        }
        return total;
    }
}

public class SuwimonCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        ShoppingCart cart = new ShoppingCart();

        for (int i = 0; i < N; i++) {
            String pname = sc.nextLine();
            double pprice = sc.nextDouble();
            sc.nextLine();
            cart.addProduct(new Product(pname, pprice));
        }

        System.out.println(cart.calculateTotalPrice());
        sc.close();
    }
}
