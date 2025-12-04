import java.util.Scanner;

class DatabaseConnection {
    private String connectionString;
    private boolean connected;

    // Constructor
    public DatabaseConnection(String connectionString) {
        this.connectionString = connectionString;
        this.connected = false;
    }

    // Check connection status
    public boolean isConnected() {
        return connected;
    }

    // Connect method
    public void connect() {
        if (!connected) {
            connected = true;
            System.out.println("Connected to " + connectionString);
        } else {
            System.out.println("Already connected.");
        }
    }

    // Disconnect method
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
        // ใช้ try-with-resources ปิด Scanner อัตโนมัติ
        try (Scanner sc = new Scanner(System.in)) {

            // รับชื่อ server จาก input
            String serverName = sc.nextLine();

            // สร้าง object DatabaseConnection
            DatabaseConnection db = new DatabaseConnection(serverName);

            // เทสต์ตามลำดับ
            db.connect();
            db.disconnect();
            db.disconnect();

            // แสดงสถานะปัจจุบัน
            boolean status = db.isConnected();
            System.out.println(status);
        }
    }
}
