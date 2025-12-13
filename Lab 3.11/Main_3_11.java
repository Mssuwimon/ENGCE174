import java.util.Scanner;

/*
 * Lab 3.11
 * Simple configuration command processor
 * Supports: SHOW, SET_URL, SET MAX
 */
public class Main_3_11 {

    // ค่าเริ่มต้นของระบบ
    private static String url = "default.server.com";
    private static int max = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ทำงานจนกว่าจะไม่มี input หรือบรรทัดว่าง
        while (true) {
            if (!sc.hasNextLine()) {
                break;
            }

            String line = sc.nextLine();
            if (line.isEmpty()) {
                break;
            }

            int count = parseCount(line);
            if (count <= 0) {

public class Main_3_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String url = "default.server.com";
        int max = 10;

        while (true) {
            if (!sc.hasNextLine()) break;
            String line = sc.nextLine();
            if (line.isEmpty()) break;

            int count;
            try {
                count = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Invalid count.");
                continue;
            }

            if (count <= 0) {
                System.out.println("Invalid count.");
                // ข้าม input ถัดไปตามจำนวน count ที่ไม่ถูกต้อง
                for (int j = 0; j < Math.abs(count); j++) {
                    if (sc.hasNextLine()) sc.nextLine();
                }
                continue;
            }

            for (int i = 0; i < count; i++) {
                if (!sc.hasNextLine()) break;
                String command = sc.nextLine();

                if (command.equalsIgnoreCase("SHOW")) {
                    System.out.println("URL: " + url);
                    System.out.println("MAX: " + max);
                } else if (command.equalsIgnoreCase("SET_URL")) {
                    if (i + 1 < count && sc.hasNextLine()) {
                        String newUrl = sc.nextLine();
                        url = newUrl;
                    }
                } else if (command.equalsIgnoreCase("SET MAX") || command.equalsIgnoreCase("SET_MAX")) {
                    if (i + 1 < count && sc.hasNextLine()) {
                        String val = sc.nextLine();
                        try {
                            int newMax = Integer.parseInt(val);
                            if (newMax > 0) {
                                max = newMax;
                                System.out.println("MAX: " + max);
                            } else {
                                System.out.println("Invalid count.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid count.");
                        }
                    }
                }
            }
        }

        sc.close();
    }


    /*
     * แปลงค่าจำนวนคำสั่ง
     * แยก method เพื่อให้ main อ่านง่าย
     */
    private static int parseCount(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    /*
     * ประมวลผลคำสั่งตามจำนวนที่ระบุ
     */
    private static void processCommands(Scanner sc, int count) {
        for (int i = 0; i < count; i++) {
            if (!sc.hasNextLine()) {
                return;
            }

            String command = sc.nextLine();

            if (command.equalsIgnoreCase("SHOW")) {
                showConfig();
            } 
            else if (command.equalsIgnoreCase("SET_URL")) {
                setUrl(sc);
            } 
            else if (command.equalsIgnoreCase("SET MAX") || command.equalsIgnoreCase("SET_MAX")) {
                setMax(sc);
            }
        }
    }

    /*
     * แสดงค่าปัจจุบันของระบบ
     */
    private static void showConfig() {
        System.out.println("URL: " + url);
        System.out.println("MAX: " + max);
    }

    /*
     * ตั้งค่า URL ใหม่
     */
    private static void setUrl(Scanner sc) {
        if (sc.hasNextLine()) {
            url = sc.nextLine();
        }
    }

    /*
     * ตั้งค่า MAX ใหม่ พร้อมตรวจสอบความถูกต้อง
     */
    private static void setMax(Scanner sc) {
        if (!sc.hasNextLine()) {
            return;
        }

        String value = sc.nextLine();
        try {
            int newMax = Integer.parseInt(value);
            if (newMax > 0) {
                max = newMax;
                System.out.println("MAX: " + max);
            } else {
                System.out.println("Invalid count.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid count.");
        }
    }
}
