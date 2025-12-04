import java.util.Scanner;

class DatabaseConnection {
    private String connectionString;
    private boolean connected;

    public DatabaseConnection(String connectionString) {
        this.connectionString = connectionString;
        this.connected = false;
    }

    public boolean isConnected() {
        return connected;
    }

    public void connect() {
        if (!connected) {
            connected = true;
            System.out.println("Connected to " + connectionString);
        } else {
            System.out.println("Already connected.");
        }
    }

    public void disconnect() {
        if (connected) {
            connected = false;
            System.out.println("Disconnected.");
        } else {
            System.out.println("Already disconnected.");
        }
    }
}

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับชื่อ server จาก input
        String serverName = sc.nextLine();
        DatabaseConnection db = new DatabaseConnection(serverName);

        // เทสต์ตามลำดับ
        db.connect();          // connect
        db.disconnect();       // disconnect
        db.disconnect();       // disconnect อีกครั้ง
        System.out.println(db.isConnected());  // เช็คสถานะ boolean
    }
}
