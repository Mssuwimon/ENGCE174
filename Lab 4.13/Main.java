import java.util.Scanner;

class Subscription {

    private final String planName;
    private final int durationDays;

    private static int maxDuration = 365;

    // Constructor (policy enforced)
    public Subscription(String planName, int durationDays) {
        this.planName = planName;

        if (durationDays > maxDuration) {
            this.durationDays = maxDuration;
        } else if (durationDays < 0) {
            this.durationDays = 0;
        } else {
            this.durationDays = durationDays;
        }
    }

    // Internal constructor (no cut)
    private Subscription(String planName, int durationDays, boolean bypass) {
        this.planName = planName;
        this.durationDays = durationDays;
    }

    public static void setMaxDuration(int max) {
        if (max > 0) {
            maxDuration = max;
            System.out.println("Max duration set to " + max);
        } else {
            System.out.println("Invalid max policy.");
        }
    }

    public Subscription extend(int days) {

        if (days <= 0) {
            System.out.println("Invalid extension days.");
            return this;
        }

        int newDays = this.durationDays + days;


        if (this.durationDays < maxDuration && newDays > maxDuration) {
            System.out.println("Extension failed: Exceeds max policy.");
            return this;
        }

        System.out.println("Extension successful.");
        return new Subscription(this.planName, newDays, true);
    }

    public void displayInfo() {
        System.out.println("Plan: " + planName + ", Days: " + durationDays);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int max = scanner.nextInt();
        Subscription.setMaxDuration(max);

        String name = scanner.next();
        int days = scanner.nextInt();

        Subscription sub = new Subscription(name, days);

        int d1 = scanner.nextInt();
        sub = sub.extend(d1);

        int d2 = scanner.nextInt();
        sub = sub.extend(d2);

        sub.displayInfo();
        scanner.close();
    }
}
