import java.util.Scanner;

class Product {

    private String name;
    private double price;

    // Constructor Overloading 2 (Main Constructor)
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Constructor Overloading 1 (Chaining Constructor)
    // CLO1: Calls main constructor with default price 0.0
    public Product(String name) {
        this(name, 0.0);
    }

    // Method to display product information in the required format
    public void displayInfo() {
        // *** FIX: Use String.format to ensure the price is always displayed with exactly two decimal places. ***
        String formattedPrice = String.format("%.2f", price);
        System.out.println("Product: " + name + ", Price: " + formattedPrice);
    }
}

public class Main {

    public static void main(String[] args) {

        // CLO4: Use try-with-resources for automatic Scanner closing
        try (Scanner scanner = new Scanner(System.in)) {
            
            // Read the mode (1 or 2)
            int mode = Integer.parseInt(scanner.nextLine().trim());
            
            Product product;

            if (mode == 1) {
                // Mode 1: Read name only
                String name = scanner.nextLine().trim();
                product = new Product(name);
                
            } else if (mode == 2) {
                // Mode 2: Read name and price
                String name = scanner.nextLine().trim();
                double price = Double.parseDouble(scanner.nextLine().trim());
                product = new Product(name, price);
                
            } else {
                // Fallback for robust programming
                product = new Product("Invalid", 0.0); 
            }

            // Call the fixed displayInfo() method
            product.displayInfo();

        } catch (Exception e) {
            // Error handling block
        }
    }
}