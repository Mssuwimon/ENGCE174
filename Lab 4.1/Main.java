import java.util.Scanner;

class Book {

    private String title;
    private String author;

    // Constructor Overloading 1: Accepts only title, sets author to "Unknown"
    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
    }

    // Constructor Overloading 2: Accepts both title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display book information in the required format
    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

public class Main {

    public static void main(String[] args) {

        // Use try-with-resources for automatic Scanner closing (improves stability)
        try (Scanner scanner = new Scanner(System.in)) {
            
            // Read the mode (1 or 2) from the first line of input
            int mode = Integer.parseInt(scanner.nextLine().trim());
            
            Book book;

            if (mode == 1) {
                // Mode 1: Read title only
                String title = scanner.nextLine().trim();
                
                // Use Constructor 1
                book = new Book(title);
                
            } else if (mode == 2) {
                // Mode 2: Read title and author
                String title = scanner.nextLine().trim();
                String author = scanner.nextLine().trim();
                
                // Use Constructor 2
                book = new Book(title, author);
                
            } else {
                // Fallback for unexpected mode input
                book = new Book("N/A", "N/A"); 
            }

            // After object creation, call the displayInfo() method
            book.displayInfo();

        } catch (Exception e) {
            // Handle any unexpected errors (e.g., non-numeric mode input)
        }
    }
}