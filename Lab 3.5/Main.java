import java.util.Scanner;

class DBConnection {

    private String serverName;      // Server identifier
    private boolean isConnected;    // Connection status flag

    public DBConnection(String serverName) {
        this.serverName = serverName;
        this.isConnected = false;
    }

    public boolean getStatus() {
        return isConnected;
    }

    public void connect() {
        if (!isConnected) {
            isConnected = true;
            System.out.println("Connected to " + serverName);
        } else {
            System.out.println("Already connected.");
        }
    }

    public void disconnect() {
        if (isConnected) {
            isConnected = false;
            System.out.println("Disconnected.");
        } else {
            System.out.println("Already disconnected.");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            String serverName = scanner.nextLine().trim();

            DBConnection database = new DBConnection(serverName);
            
            database.connect();
            database.disconnect();
            database.disconnect();

            // The test case expects only the boolean value in the last line.
            System.out.println(database.getStatus()); 
            
        } catch (Exception e) {
            // Minimal error handling block
        }
    }
}