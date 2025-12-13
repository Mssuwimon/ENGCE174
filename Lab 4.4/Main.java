import java.util.Scanner;

class Location {

    private double latitude;
    private double longitude;

    // Constructor 1 (Main Constructor)
    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Constructor 2 (Copy Constructor)
    public Location(Location other) {
        this.latitude = other.latitude;
        this.longitude = other.longitude;
    }

    // Setter method for latitude
    public void setLatitude(double newLat) {
        this.latitude = newLat;
    }

    // Method to display location information
    public void displayInfo() {
        System.out.println("Lat: " + latitude + ", Lon: " + longitude);
    }
}

public class Main {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            
            // Read initial Latitude, initial Longitude, and new Latitude
            double initialLat = Double.parseDouble(scanner.nextLine().trim());
            double initialLon = Double.parseDouble(scanner.nextLine().trim());
            double newLat = Double.parseDouble(scanner.nextLine().trim());
            
            // 1. Create loc1 (Original)
            Location loc1 = new Location(initialLat, initialLon);

            // 2. Create loc2 (Copy)
            Location loc2 = new Location(loc1);

            // 3. Modify loc1
            loc1.setLatitude(newLat);

            // 4. Display results
            loc1.displayInfo();
            loc2.displayInfo();

        } catch (Exception e) {
            // Error handling block
        }
    }
}