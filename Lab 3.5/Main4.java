import java.util.Scanner;

class ServerConnection {
    private String host;
    private boolean active;

    public ServerConnection(String host) {
        this.host = host;
        this.active = false;
    }

    public boolean status() {
        return active;
    }

    public void connect() {
        if (active) {
            System.out.println("Already connected.");
        } else {
            active = true;
            System.out.println("Connected to " + host);
        }
    }

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

        try (Scanner sc = new Scanner(System.in)) {

            // จำนวน Test Case
            int t = 3;

            for (int i = 1; i <= t; i++) {
                // รับชื่อ server
                String serverName = sc.nextLine();

                // สร้าง object
                ServerConnection conn = new ServerConnection(serverName);

                // เทสต์ตามโจทย์
                conn.connect();
                conn.disconnect();
                conn.disconnect();

                // แสดงสถานะปัจจุบัน
                System.out.println(conn.status());

                
                System.out.println();
            }
        }
    }
}
