import java.util.Scanner;

// This class demonstrates Encapsulation
class User {

    private String username;  // private attribute

    public User(String username) {  // constructor
        this.username = username;
    }

    public String getUsername() {   // getter method
        return username;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String inputName = sc.nextLine();    // read username

        User user = new User(inputName);     // create object

        System.out.println(user.getUsername()); // output

        sc.close();
    }
}
