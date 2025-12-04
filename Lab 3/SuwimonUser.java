import java.util.Scanner;

// Class User ใช้หลัก Encapsulation ซ่อนข้อมูล username ด้วย private
class User {
    private String username;  // เก็บชื่อผู้ใช้ (private ห้ามเข้าถึงตรง ๆ)

    // Constructor รับค่า username เพื่อกำหนดเริ่มต้น
    public User(String username) {
        this.username = username;
    }

    // Getter ให้เข้าถึง username อย่างปลอดภัย
    public String getUsername() {
        return username;
    }
}

public class SuwimonUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับค่าชื่อผู้ใช้จากผู้ใช้ 1 บรรทัด
        String inputName = sc.nextLine();

        // สร้างอ็อบเจ็กต์ User
        User u = new User(inputName);

        // แสดงผลชื่อผู้ใช้ผ่าน getter (OOP Encapsulation)
        System.out.println(u.getUsername());

        sc.close();
    }
}
