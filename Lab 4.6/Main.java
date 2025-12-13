import java.util.Scanner;

class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Method to move (returns a new Point object)
    public Point move(int dx, int dy) {
        int newX = this.x + dx;
        int newY = this.y + dy;
        
        // Returns new Point object, preserving immutability
        return new Point(newX, newY); 
    }

    public void displayInfo() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

public class Main {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            
            // Read initial X, initial Y, DX, DY
            int initialX = Integer.parseInt(scanner.nextLine().trim());
            int initialY = Integer.parseInt(scanner.nextLine().trim());
            int dx = Integer.parseInt(scanner.nextLine().trim());
            int dy = Integer.parseInt(scanner.nextLine().trim());
            
            // 1. Create p1 (Original)
            Point p1 = new Point(initialX, initialY); 
            
            // 2. Create p2 (p1 moved once)
            Point p2 = p1.move(dx, dy); 
            
            // 3. Create p3 (p2 moved again)
            Point p3 = p2.move(dx, dy); 

            // 4. Display results
            p1.displayInfo();
            p2.displayInfo();
            p3.displayInfo();

        } catch (Exception e) {
            // Error handling block
        }
    }
}