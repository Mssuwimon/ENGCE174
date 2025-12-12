import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class SystemLogger {
    private static int currentLogLevel = 1; // 1=INFO, 2=DEBUG, 3=ERROR

    private static String getLevelName(int level) {
        switch (level) {
            case 1: return "INFO";
            case 2: return "DEBUG";
            case 3: return "ERROR";
            default: return "UNKNOWN";
        }
    }

    public static void setLogLevel(int newLevel) {
        if (newLevel >= 1 && newLevel <= 3) {
            currentLogLevel = newLevel;
            System.out.println("Log level set to " + getLevelName(newLevel));
        } else {
            System.out.println("Invalid log level");
        }
    }

    public static void log(int messageLevel, String message) {
        if (messageLevel >= currentLogLevel) {
            System.out.println("[" + getLevelName(messageLevel) + "]: " + message);
        }
    }
}

public class Main_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < N; i++) {
            String command = br.readLine().trim();
            if (command.equals("SET")) {
                int level = Integer.parseInt(br.readLine().trim());
                SystemLogger.setLogLevel(level);
            } else if (command.equals("LOG")) {
                int messageLevel = Integer.parseInt(br.readLine().trim());
                String message = br.readLine();
                SystemLogger.log(messageLevel, message);
            }
        }
    }
}
