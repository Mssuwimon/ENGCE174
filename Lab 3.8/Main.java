class InventoryItem {
    private String productName;
    private int stock;

    public InventoryItem(String productName, int initialStock) {
        this.productName = productName;
        if (initialStock >= 0) {
            this.stock = initialStock;
        } else {
            this.stock = 0;
        }
    }

    public String getProductName() {
        return productName;
    }

    public int getStock() {
        return stock;
    }

    public void addStock(int amount) {
        if (amount > 0) {
            stock += amount;
            System.out.println("Stock added.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void sellStock(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > stock) {
            System.out.println("Not enough stock.");
        } else {
            stock -= amount;
            System.out.println("Sale successful.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        String name = sc.nextLine();
        int startStock = sc.nextInt();
        int N = sc.nextInt();
        sc.nextLine(); // clear buffer

        InventoryItem item = new InventoryItem(name, startStock);

        for (int i = 0; i < N; i++) {

            String command = sc.next();
            int amount = sc.nextInt();

            if (command.equals("ADD")) {
                item.addStock(amount);
            } else if (command.equals("SELL")) {
                item.sellStock(amount);
            }
        }

        System.out.println("Final Stock: " + item.getStock());
    }
}
