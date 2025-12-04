import java.util.Scanner;

// คลาสจำลองการเชื่อมต่อฐานข้อมูล
class DBConnection {
    private String serverName;  // เก็บชื่อเซิร์ฟเวอร์
    private boolean isConnected; // สถานะการเชื่อมต่อ

    // Constructor
    public DBConnection(String serverName) {
        this.serverName = serverName;
        this.isConnected = false;
    }

    // ตรวจสอบสถานะ
    public boolean status() {
        return isConnected;
    }

    // เชื่อมต่อ
    public void connect() {
        if (!isConnected) {
            isConnected = true;
            System.out.println("Connected to " + serverName);
        } else {
            System.out.println("Already connected.");
        }
    }

    // ตัดการเชื่อมต่อ
    public void disconnect() {
        if (isConnected) {
            isConnected = false;
            System.out.println("Disconnected");
        } else {
            System.out.println("Already disconnected.");
        }
    }
}

public class Main4 {
    public static void main(String[] args) {
        // Scanner ปิดอัตโนมัติ
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter database server name: ");
            String dbServer = input.nextLine();

            DBConnection db = new DBConnection(dbServer);

            // ทดลองเชื่อมต่อและตัดการเชื่อมต่อ
            db.connect();      // connect ครั้งแรก
            db.disconnect();   // disconnect ครั้งแรก
            db.disconnect();   // disconnect ครั้งสอง

            // แสดงสถานะปัจจุบัน
            System.out.println("Connected status: " + db.status());
        }
    }
}
