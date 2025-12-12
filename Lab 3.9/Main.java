import java.util.*;

class User {
    private String username;
    private String password;
    private static int minLength = 0;

    public User(String username, String password) {
        this.username = username;

        if (password.length() >= minLength) {
            this.password = password;
            System.out.println("Creation successful.");
        } else {
            this.password = "invalid";
            System.out.println("Creation failed.");
        }
    }

    public String getPassword() {
        return this.password;
    }

    public void updatePassword(String newPass) {
        if (newPass.length() >= minLength) {
            this.password = newPass;
            System.out.println("Update successful.");
        } else {
            System.out.println("Update failed.");
        }
    }

    public static void setMinLength(int len) {
        if (len >= 4) {
            minLength = len;
            System.out.println("New min length set to " + len);
        } else {
            System.out.println("Invalid length.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;

            int firstMin = Integer.parseInt(line);
            String u1 = sc.nextLine().trim();
            String p1 = sc.nextLine().trim();
            String u2 = sc.nextLine().trim();
            String p2 = sc.nextLine().trim();
            int secondMin = Integer.parseInt(sc.nextLine().trim());
            String newPass2 = sc.nextLine().trim();

            User.setMinLength(firstMin);

            User user1 = new User(u1, p1);
            User user2 = new User(u2, p2);

            User.setMinLength(secondMin);

            user2.updatePassword(newPass2);

            System.out.println(user1.getPassword());
            System.out.println(user2.getPassword());
        }

        sc.close();
    }
}
