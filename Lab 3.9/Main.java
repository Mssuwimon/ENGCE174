import java.util.*;

// Class User สำหรับเก็บข้อมูล username และ password
class User {
    private String username;
    private String password;
    private static int minLength = 0; // ความยาวขั้นต่ำของ password

    // Constructor สำหรับสร้าง User ใหม่
    public User(String username, String password) {
        this.username = username;

        // ตรวจสอบความยาว password
        if (password.length() >= minLength) {
            this.password = password;
            System.out.println("Creation successful.");
        } else {
            this.password = "invalid"; // ถ้าไม่ผ่านตั้งเป็น "invalid"
            System.out.println("Creation failed.");
        }
    }

    // Method สำหรับดึง password
    public String getPassword() {
        return this.password;
    }

    // Method สำหรับอัปเดต password
    public void updatePassword(String newPass) {
        if (newPass.length() >= minLength) {
            this.password = newPass;
            System.out.println("Update successful.");
        } else {
            System.out.println("Update failed.");
        }
    }

    // Method สำหรับตั้งค่า minLength
    public static void setMinLength(int len) {
        if (len >= 4) {
            minLength = len;
            System.out.println("New min length set to " + len);
        } else {
            System.out.println("Invalid length.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // อ่านข้อมูลและประมวลผลต่อเนื่องจนหมด input
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) {
                continue; // ข้ามบรรทัดว่าง
            }

            // อ่านค่าความยาว password ขั้นต่ำรอบแรก
            int firstMin = Integer.parseInt(line);

            // อ่านข้อมูล User 1
            String u1 = sc.nextLine().trim();
            String p1 = sc.nextLine().trim();

            // อ่านข้อมูล User 2
            String u2 = sc.nextLine().trim();
            String p2 = sc.nextLine().trim();

            // อ่านค่าความยาว password ขั้นต่ำรอบสอง
            int secondMin = Integer.parseInt(sc.nextLine().trim());

            // อ่าน password ใหม่สำหรับ User 2
            String newPass2 = sc.nextLine().trim();

            // ตั้งค่าความยาว password ขั้นต่ำรอบแรก
            User.setMinLength(firstMin);

            // สร้าง User
            User user1 = new User(u1, p1);
            User user2 = new User(u2, p2);

            // ตั้งค่าความยาว password ขั้นต่ำรอบสอง
            User.setMinLength(secondMin);

            // อัปเดต password ของ User 2
            user2.updatePassword(newPass2);

            // แสดง password สุดท้ายของทั้งสอง User
            System.out.println(user1.getPassword());
            System.out.println(user2.getPassword());
        }

        sc.close(); // ปิด Scanner เพื่อป้องกัน resource leak
    }
}
