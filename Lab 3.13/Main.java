import java.util.Scanner;

class LicenseManager {

    private static int maxLicenses = 10;
    private static int usedLicenses = 0;

    public static void setMax(int max) {
        if (max < 0) {
            System.out.println("Invalid max value.");
        } else if (max < usedLicenses) {
            System.out.println("Cannot set max lower than current usage.");
        } else {
            maxLicenses = max;
            System.out.println("Max licenses set to " + max);
        }
    }

    public static boolean checkOut() {
        if (usedLicenses < maxLicenses) {
            usedLicenses++;
            System.out.println("Checkout successful.");
            return true;
        } else {
            System.out.println("Checkout failed: No licenses available.");
            return false;
        }
    }

    public static void checkIn() {
        if (usedLicenses > 0) {
            usedLicenses--;
            System.out.println("Check-in successful.");
        } else {
            System.out.println("Nothing to check-in.");
        }
    }

    public static void displayStatus() {
        System.out.println("Used: " + usedLicenses);
        System.out.println("Available: " + (maxLicenses - usedLicenses));
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int processed = 0;

        // อ่านอย่างน้อย n คำสั่ง แต่ถ้ายังมี input ต่อ ให้อ่านต่อ
        while (processed < n || sc.hasNextLine()) {

            if (!sc.hasNextLine()) break;

            String command = sc.nextLine().trim();
            if (command.isEmpty()) break;

            switch (command) {
                case "SET":
                    int max = Integer.parseInt(sc.nextLine());
                    LicenseManager.setMax(max);
                    break;

                case "CHECKOUT":
                    LicenseManager.checkOut();
                    break;

                case "CHECKIN":
                    LicenseManager.checkIn();
                    break;

                case "STATUS":
                    LicenseManager.displayStatus();
                    break;
            }

            processed++;
        }

        sc.close();
    }
}
