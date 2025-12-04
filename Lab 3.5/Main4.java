import java.util.Scanner;

// คลาสจำลองการเชื่อมต่อกับฐานข้อมูล
class DatabaseLink {

    private String serverName;  // ชื่อ server
    private boolean linked;     // สถานะเชื่อมต่อ

    // Constructor: กำหนด serverName และเริ่มต้น disconnected
    public DatabaseLink(String serverName) {
        this.serverName = serverName;
        this.linked = false;
    }

    // เช็คสถานะปัจจุบัน
    public boolean status() {
        return linked;
    }

    // เชื่อมต่อ server
    public void establish() {
        if (linked) {
            System.out.println("Already connected.");
        } else {
            linked = true;
            System.out.println("Connected to " + serverName);
        }
    }

    // ตัดการเชื่อมต่อ server
    public void terminate() {
        if (!linked) {
            System.out.println("Already disconnected.");
        } else {
            linked = false;
            System.out.println("Disconnected.");
        }
    }
}

public class Main4 {
    public static void main(String[] args) {

        // Scanner ปิดอัตโนมัติ
        try (Scanner scanner = new Scanner(System.in)) {

            // รับชื่อ server
            String inputServer = scanner.nextLine();

            // สร้าง object DatabaseLink
            DatabaseLink db = new DatabaseLink(inputServer);

            // เทสต์ตามลำดับโจทย์
            db.establish();   // connect
            db.terminate();   // disconnect ครั้งแรก
            db.terminate();   // disconnect ครั้งสอง

            // แสดงสถานะปัจจุบัน
            System.out.println(db.status());
        }
    }
}
