import java.util.Scanner;

public class Labb101 {

    public static void main(String[] args) {
        // สร้าง Scanner
        Scanner scanner = new Scanner(System.in);

        // รับค่าตัวเลขที่ 1
        System.out.println("Input number 1:");
        int num1 = scanner.nextInt();

        // รับค่าตัวเลขที่ 2
        System.out.println("Input number 2:");
        int num2 = scanner.nextInt();

        // คำนวณ
        int sum = num1 + num2;

        // แสดงผล
        System.out.println("Sum is: " + sum);

        // ปิด Scanner
        scanner.close();
    }
}
