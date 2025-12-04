import java.util.Scanner;

// คลาสจำลองการเชื่อมต่อฐานข้อมูล
class DatabaseConnection {
    private String connectionString; // เก็บชื่อเซิร์ฟเวอร์
    private boolean connected;        // สถานะการเชื่อมต่อ

    // Constructor กำหนดชื่อ server และ connected เริ่มต้นเป็น false
    public DatabaseConnection(String connectionString) {
        this.connectionString = connectionString;
        this.connected = false;
    }

    // ตรวจสอบสถานะ
    public boolean isConnected() {
        return connected;
    }

    // เมธอดเชื่อมต่อ
    public void connect() {
        if (!connected) {
            connected = true;
            System.out.println("Connected to " + connectionString);
        } else {
            System.out.println("Already connected.");
        }
    }

    // เมธอดตัดการเชื่อมต่อ
    public void disconnect() {
        if (connected) {
            connected = false;
            System.out.println("Disconnected");
        } else {
            System.out.println("Already disconnected.");
        }
    }
}

public class Main4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter database server name: ");
            String dbServer = scanner.nextLine();

            DatabaseConnection dbConn = new DatabaseConnection(dbServer);

            // ทดลองเชื่อมต่อและตัดการเชื่อมต่อ
            dbConn.connect();      // connect ครั้งแรก
            dbConn.disconnect();   // disconnect ครั้งแรก
            dbConn.disconnect();   // disconnect ครั้งสอง

            // แสดงสถานะปัจจุบัน
            System.out.println("Connected status: " + dbConn.isConnected());
        }
    }
}
