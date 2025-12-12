import java.util.Scanner;

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
}
