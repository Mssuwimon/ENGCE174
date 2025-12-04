import java.util.Scanner;

// คลาสจัดการการเชื่อมต่อ server
class ServerManager {

    private String serverLabel; // เก็บชื่อ server
    private boolean active;     // สถานะเชื่อมต่อ

    // Constructor: กำหนด serverLabel และเริ่มต้น disconnected
    public ServerManager(String serverLabel) {
        this.serverLabel = serverLabel;
        this.active = false;
    }

    // Method เช็คสถานะ
    public boolean isActive() {
        return active;
    }

    // Method เชื่อมต่อ server
    public void connect() {
        if (active) {
            System.out.println("Already connected.");
        } else {
            active = true;
            System.out.println("Connected to " + serverLabel);
        }
    }

    // Method ตัดการเชื่อมต่อ server
    public void disconnect() {
        if (!active) {
            System.out.println("Already disconnected.");
        } else {
            active = false;
            System.out.println("Disconnected.");
        }
    }
}

public class Main4 {
    public static void main(String[] args) {

        // Scanner ปิดอัตโนมัติ
        try (Scanner sc = new Scanner(System.in)) {

            // รับชื่อ server จาก input
            String inputServer = sc.nextLine();

            // สร้าง object ServerManager
            ServerManager sm = new ServerManager(inputServer);

            sm.connect();       // connect
            sm.disconnect();    // disconnect ครั้งแรก
            sm.disconnect();    // disconnect ครั้งสอง

            // แสดงสถานะปัจจุบัน
            System.out.println(sm.isActive());
        }
    }
}
