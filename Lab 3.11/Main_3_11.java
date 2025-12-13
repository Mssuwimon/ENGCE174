import java.util.Scanner;

/*
 * Lab 3.11
 * Command-based configuration system
 */
public class Main_3_11 {

    // System configuration (default values)
    private static String serverUrl = "default.server.com";
    private static int maxConnections = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read command count
        if (!scanner.hasNextLine()) {
            scanner.close();
            return;
        }

        String inputLine = scanner.nextLine();
        int commandCount = parseCommandCount(inputLine);

        if (commandCount <= 0) {
            System.out.println("Invalid count.");
            scanner.close();
            return;
        }

        // Process commands
        processCommands(scanner, commandCount);

        scanner.close();
    }

    /*
     * Convert input to integer command count
     */
    private static int parseCommandCount(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException exception) {
            return -1;
        }
    }

    /*
     * Execute commands based on count
     */
    private static void processCommands(Scanner scanner, int commandCount) {
        for (int index = 0; index < commandCount; index++) {

            if (!scanner.hasNextLine()) {
                return;
            }

            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("SHOW")) {
                showStatus();
            }
            else if (command.equalsIgnoreCase("SET_URL")) {
                updateUrl(scanner);
            }
            else if (command.equalsIgnoreCase("SET_MAX")) {
                updateMaxConnections(scanner);
            }
        }
    }

    /*
     * Display current configuration
     */
    private static void showStatus() {
        System.out.println("URL: " + serverUrl);
        System.out.println("MAX: " + maxConnections);
    }

    /*
     * Update server URL
     */
    private static void updateUrl(Scanner scanner) {
        if (scanner.hasNextLine()) {
            serverUrl = scanner.nextLine();
        }
    }

    /*
     * Update maximum connections with validation
     */
    private static void updateMaxConnections(Scanner scanner) {
        if (!scanner.hasNextLine()) {
            return;
        }

        String value = scanner.nextLine();

        try {
            int newMax = Integer.parseInt(value);

            if (newMax > 0) {
                maxConnections = newMax;
                System.out.println("Max connections set.");
            } else {
                System.out.println("Invalid count.");
            }

        } catch (NumberFormatException exception) {
            System.out.println("Invalid count.");
        }
    }
}
