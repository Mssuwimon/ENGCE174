import java.util.Scanner;

class Player {

    private String username;
    private int level;

    // Constructor Overloading 2 (Main Constructor)
    public Player(String username, int level) {
        this.username = username;
        this.level = level;
    }
    
    // Constructor Overloading 1 (Default Constructor)
    public Player() {
        this.username = "Guest";
        this.level = 1;
    }

    // Method to display player profile information
    public void displayProfile() {
        System.out.println("User: " + username + ", Level: " + level);
    }
}

public class Main {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            
            int mode = Integer.parseInt(scanner.nextLine().trim());
            
            Player player;

            if (mode == 1) {
                // Mode 1: Use Default Constructor
                player = new Player();
                
            } else if (mode == 2) {
                // Mode 2: Read username and level
                String username = scanner.nextLine().trim();
                int level = Integer.parseInt(scanner.nextLine().trim());
                player = new Player(username, level);
                
            } else {
                player = new Player(); 
            }

            player.displayProfile();

        } catch (Exception e) {
            // Error handling block
        }
    }
}