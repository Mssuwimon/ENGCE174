import java.util.Scanner;

class User {

    private String username;
    private int failedAttempts;
    private boolean isLocked;

    private static int maxAttempts = 3;

    // Constructor
    public User(String username) {
        this.username = username;
        this.failedAttempts = 0;
        this.isLocked = false;
    }

    // Static policy setter
    public static void setPolicy(int max) {
        if (max > 0) {
            maxAttempts = max;
            System.out.println("Policy updated.");
        } else {
            System.out.println("Invalid policy.");
        }
    }

    public String getUsername() {
        return username;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public int getFailedAttempts() {
        return failedAttempts;
    }

    // Login logic
    public void login(String password) {

        if (isLocked) {
            System.out.println("Account is locked.");
            return;
        }

        if (password.equals("pass123")) {
            failedAttempts = 0;
            System.out.println("Login successful.");
        } else {
            failedAttempts++;

            if (failedAttempts >= maxAttempts) {
                isLocked = true;
                System.out.println("Login failed. Account locked.");
            } else {
                int remaining = maxAttempts - failedAttempts;
                System.out.println(
                    "Login failed. " + remaining + " attempts left."
                );
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read username
        String username = scanner.nextLine();
        User user = new User(username);

        // Read number of commands
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {

            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("SET_POLICY")) {

                int newPolicy = scanner.nextInt();
                scanner.nextLine();
                User.setPolicy(newPolicy);

            } else if (command.equalsIgnoreCase("LOGIN")) {

                String password = scanner.nextLine();
                user.login(password);
            }
        }

        scanner.close();
    }
}
