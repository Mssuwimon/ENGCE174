import java.util.Scanner;

public class Main_3_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String name = sc.nextLine();
            if (name.isEmpty()) break;

            double salary = 0.0;
            double raisePercent = 0.0;
            double raiseAmount = 0.0;

            // อ่านเงินเดือน
            if (sc.hasNextDouble()) {
                salary = sc.nextDouble();
            } else {
                sc.nextLine(); // skip invalid
            }

            // อ่าน raisePercent
            if (sc.hasNextDouble()) {
                raisePercent = sc.nextDouble();
            } else {
                sc.nextLine();
            }

            // อ่าน raiseAmount
            if (sc.hasNextDouble()) {
                raiseAmount = sc.nextDouble();
            } else {
                sc.nextLine();
            }

            sc.nextLine(); // consume newline

            // Tax ก่อนปรับ
            double taxBefore = salary * 1.2;
            System.out.printf("Tax (Before): %.1f%n", taxBefore);

            // ตรวจสอบ raiseAmount
            if (raiseAmount < 0) {
                System.out.println("Invalid amount.");
            } else {
                salary += raiseAmount;
                System.out.println("Raise applied.");
            }

            double taxAfter = salary * 1.2;
            System.out.printf("Tax (After): %.1f%n", taxAfter);
        }

        sc.close();
    }
}
