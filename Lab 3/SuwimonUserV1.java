import java.util.Scanner;

/*
 * คลาส User ใช้หลัก Encapsulation โดยซ่อนข้อมูล username ไว้เป็น private
 * มี constructor สำหรับกำหนดค่าเริ่มต้นให้ username
 * และมี getter สำหรับอ่านค่าอย่างปลอดภัย
 */
class User {

    // ตัวแปรเก็บชื่อผู้ใช้ แบบ private เพื่อป้องกันการเข้าถึงโดยตรง
    private String username;

    // Constructor รับค่าเริ่มต้นของ username
    public User(String initialName) {
        this.username = initialName;
    }

    // Getter อ่านค่า username
    public String getUsername() {
        return username;
    }
}

public class SuwimonUserV1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // อ่านชื่อผู้ใช้จาก input 1 บรรทัด
        String inputName = sc.nextLine();

        // สร้างออบเจ็กต์ User ด้วยชื่อที่ผู้ใช้ป้อน
        User user = new User(inputName);

        // แสดงผลชื่อผู้ใช้ล่าสุดผ่าน getter
        System.out.println(user.getUsername());

        sc.close();
    }
}
