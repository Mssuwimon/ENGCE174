import java.util.Scanner;

// Class for representing a time period in one day
class TimePeriod {

    private int startHour;
    private int endHour;

    // Main constructor
    public TimePeriod(int startHour, int endHour) {

        // Validation: hour must be between 0 and 23
        if (startHour < 0) {
            startHour = 0;
        } else if (startHour > 23) {
            startHour = 23;
        }

        if (endHour < 0) {
            endHour = 0;
        } else if (endHour > 23) {
            endHour = 23;
        }

        // Data integrity: start must not be greater than end
        if (startHour > endHour) {
            this.startHour = endHour;
            this.endHour = startHour;
        } else {
            this.startHour = startHour;
            this.endHour = endHour;
        }
    }

    // Default constructor
    public TimePeriod() {
        this(9, 17);
    }

    // Display method
    public void displayPeriod() {
        System.out.println(startHour + ":00 - " + endHour + ":00");
    }
}

// Main runner class
public class Lab4_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TimePeriod period;

        int mode = scanner.nextInt();

        if (mode == 1) {
            period = new TimePeriod();
        } else if (mode == 2) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            period = new TimePeriod(start, end);
        } else {
            System.out.println("Invalid mode.");
            scanner.close();
            return;
        }

        period.displayPeriod();
        scanner.close();
    }
}
