import java.util.Scanner;

class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}

public class SuwimonUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputName = sc.nextLine();

        User u = new User(inputName);

        System.out.println(u.getUsername());

        sc.close();
    }
}
