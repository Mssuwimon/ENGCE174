import java.util.Scanner;


class DBConnection {

    private String serverName;     // ชื่อเซิร์ฟเวอร์
    private boolean isConnected;   // สถานะการเชื่อมต่อ

    // Constructor
    public DBConnection(String serverName) {
        this.serverName = serverName;
        this.isConnected = false;
    }

    // ตรวจสอบสถานะการเชื่อมต่อ
    public boolean getStatus() {
        return isConnected;
    }

    // เชื่อมต่อฐานข้อมูล
    public void connect() {
        if (isConnected == false) {
            isConnected = true;
            System.out.println("Connected to " + serverName);
        } else {
            System.out.println("Already connected.");
        }
    }

    // ตัดการเชื่อมต่อฐานข้อมูล
    public void disconnect() {
        if (isConnected == true) {
            isConnected = false;
            System.out.println("Disconnected");
        } else {
            System.out.println("Already disconnected.");
        }
    }
}

public class Main5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter database server name: ");
        String serverName = scanner.nextLine();

        DBConnection database = new DBConnection(serverName);

        // ทดลองการเชื่อมต่อ
        database.connect();
        database.disconnect();
        database.disconnect();

        // แสดงสถานะสุดท้าย
        System.out.println("Connected status: " + database.getStatus());

        // ปิด Scanner เพื่อป้องกัน resource leak
        scanner.close();
    }
}
