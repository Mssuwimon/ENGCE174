import java.util.*; 

class AccountUser {

    // ซ่อนตัวแปรข้อมูล
    private String name;

    // Constructor สำหรับกำหนดค่าชื่อเริ่มต้น
    public AccountUser(String user) {
        name = user;
    }

    // Getter คืนค่าชื่อ
    public String fetchName() {
        return name;
    }
}

public class SuwimonApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // อ่านค่าที่ผู้ใช้ป้อน
        String userInput = input.nextLine();

        // สร้างอ็อบเจ็กต์โดยส่งข้อมูลไปให้ constructor
        AccountUser profile = new AccountUser(userInput);

        // แสดงข้อมูลที่อ่านได้
        String result = profile.fetchName();
        System.out.println(result);

        input.close();
    }
}
