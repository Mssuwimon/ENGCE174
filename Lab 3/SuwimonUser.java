import java.util.Scanner;

// (คลาส User ใช้หลักการ Encapsulation)
class User {
    // (ซ่อนข้อมูล username)
    private String username;

    // (กำหนดค่าเริ่มต้นให้ Attribute ผ่าน Constructor)
    public User(String username) {
        this.username = username;
    }

    // (Getter: เอาค่าชื่อผู้ใช้แบบปลอดภัย)
    public String getUsername() {
        return username;
    }
}

public class SuwimonUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputName = sc.nextLine();

        User u = new User(inputName);

        System.out.println(u.getUsername());

        sc.close();
    }
}
