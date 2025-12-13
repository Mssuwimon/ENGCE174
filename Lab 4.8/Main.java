import java.util.Scanner;

class Movie {

    private String title;
    private String director;
    private double rating;

    // Helper method for rating validation (CLO3: Clean Code practice)
    private double validateRating(double score) {
        if (score > 10.0) {
            return 10.0; // If greater than 10.0, set to 10.0
        } else if (score < 0.0) {
            return 0.0; // If less than 0.0, set to 0.0
        } else {
            return score;
        }
    }

    // Constructor 3: Main Constructor (with Validation)
    // CLO1: Assigns validated rating
    public Movie(String title, String director, double rating) {
        this.title = title;
        this.director = director;
        this.rating = validateRating(rating);
    }

    // Constructor 2: Accepts title and director (Chains to C3 with default rating 0.0)
    // CLO1: Uses Constructor Chaining to C3
    public Movie(String title, String director) {
        this(title, director, 0.0);
    }

    // Constructor 1: Accepts title only (Chains to C2 with default director "Unknown")
    // CLO1: Uses Constructor Chaining to C2
    public Movie(String title) {
        this(title, "Unknown");
    }

    // Method to display movie details
    // CLO1 & CLO4: Output format must be "Title: [title], Director: [director], Rating: [rating]"
    public void displayDetails() {
        System.out.println("Title: " + title + ", Director: " + director + ", Rating: " + rating);
    }
}

public class Main {

    public static void main(String[] args) {

        // CLO4: Use try-with-resources for automatic Scanner closing
        try (Scanner scanner = new Scanner(System.in)) {
            
            // Read the mode (1, 2, or 3)
            int mode = Integer.parseInt(scanner.nextLine().trim());
            
            Movie movie;

            if (mode == 1) {
                // Mode 1: Input [Title]. Use C1.
                String title = scanner.nextLine().trim();
                movie = new Movie(title);
                
            } else if (mode == 2) {
                // Mode 2: Input [Title] \n [Director]. Use C2.
                String title = scanner.nextLine().trim();
                String director = scanner.nextLine().trim();
                movie = new Movie(title, director);
                
            } else if (mode == 3) {
                // Mode 3: Input [Title] \n [Director] \n [Rating]. Use C3.
                String title = scanner.nextLine().trim();
                String director = scanner.nextLine().trim();
                double rating = Double.parseDouble(scanner.nextLine().trim());
                movie = new Movie(title, director, rating);
                
            } else {
                // Handle invalid mode gracefully (CLO4 stability)
                movie = new Movie("N/A"); 
            }

            // Call the displayDetails() method
            movie.displayDetails();

        } catch (Exception e) {
            // CLO4: Error handling block
        }
    }
}