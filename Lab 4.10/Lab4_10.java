import java.util.Scanner;

// คลาส TimePeriod: สำหรับสร้างช่วงเวลาในหนึ่งวัน
class TimePeriod {
    
    // Attributes
    private int startHour; // ชั่วโมงเริ่มต้น
    private int endHour;   // ชั่วโมงสิ้นสุด

    // Helper Method สำหรับ Validation 1 (ชั่วโมงต้องอยู่ระหว่าง 0 ถึง 23)
    private int validateHour(int hour) {
        if (hour < 0) {
            return 0; // ถ้าค่าต่ำกว่า 0 ให้กำหนดเป็น 0
        } else if (hour > 23) {
            return 23; // ถ้าค่าสูงกว่า 23 ให้กำหนดเป็น 23
        }
        return hour;
    }

    // Constructor 2: Main Constructor
    public TimePeriod(int startHour, int endHour) {
        // 1. Validation 1: ปรับค่าให้อยู่ในช่วง 0-23
        int validatedStart = validateHour(startHour);
        int validatedEnd = validateHour(endHour);

        // 2. Validation 2: Data Integrity 
        if (validatedStart > validatedEnd) {
            // ทำการสลับค่า (Swap)
            this.startHour = validatedEnd;
            this.endHour = validatedStart;
        } else {
            // กำหนดค่าที่ผ่านการตรวจสอบแล้ว
            this.startHour = validatedStart;
            this.endHour = validatedEnd;
        }
    }


    public TimePeriod() {
       
        this(9, 17);
    }

    // Method: displayPeriod()
    public void displayPeriod() {
        System.out.println(this.startHour + ":00 - " + this.endHour + ":00");
    }
}

// คลาสหลักสำหรับรันโปรแกรม
public class Lab4_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TimePeriod timePeriod;
        
        // รับ "โหมด" (int) 1 หรือ 2
        int mode = scanner.nextInt();

        if (mode == 1) {
            // โหมด 1: สร้าง Object โดยใช้ Default Constructor
            timePeriod = new TimePeriod();
        } else if (mode == 2) {
            // โหมด 2: รับ startHour และ endHour
            int startHour = scanner.nextInt();
            int endHour = scanner.nextInt();
            
            // สร้าง Object โดยใช้ Main Constructor
            timePeriod = new TimePeriod(startHour, endHour);
        } else {

            System.out.println("Invalid mode.");
            scanner.close();
            return;
        }

        timePeriod.displayPeriod();
        
        scanner.close();
    }
}