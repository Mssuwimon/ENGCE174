import java.util.Scanner;

class Color {

    private int red;
    private int green;
    private int blue;

    // Helper method for color component validation
    private int validateColorComponent(int value) {
        if (value < 0) {
            return 0;
        } else if (value > 255) {
            return 255;
        } else {
            return value;
        }
    }

    // Main Constructor with Validation
    public Color(int r, int g, int b) {
        this.red = validateColorComponent(r);
        this.green = validateColorComponent(g);
        this.blue = validateColorComponent(b);
    }

    // Getters (No Setters for Immutability)
    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }
    
    // Method to display RGB information
    public void displayRGB() {
        System.out.println("R=" + red + ", G=" + green + ", B=" + blue);
    }
}

public class Main {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            
            int r = Integer.parseInt(scanner.nextLine().trim());
            int g = Integer.parseInt(scanner.nextLine().trim());
            int b = Integer.parseInt(scanner.nextLine().trim());
            
            Color color = new Color(r, g, b);
            
            color.displayRGB();

        } catch (Exception e) {
            // Error handling block
        }
    }
}