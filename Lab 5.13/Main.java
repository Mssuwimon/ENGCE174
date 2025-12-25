import java.util.Scanner;

class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    public int getClearanceLevel() {
        return 1;
    }
}

class Developer extends User {
    protected int projects;

    public Developer(String name, int projects) {
        super(name);
        this.projects = projects;
    }

    @Override
    public int getClearanceLevel() {
        return 2;
    }
}

class Admin extends Developer {
    protected String adminKey;

    public Admin(String name, int projects, String adminKey) {
        super(name, projects);
        this.adminKey = adminKey;
    }

    @Override
    public int getClearanceLevel() {
        return 3;
    }

    public String getAdminKey() {
        return adminKey;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input Developer
        String devName = sc.nextLine();
        int devProjects = Integer.parseInt(sc.nextLine());

        // Input Admin
        String adminName = sc.nextLine();
        int adminProjects = Integer.parseInt(sc.nextLine());
        String adminKey = sc.nextLine();

        // Create objects
        User u1 = new User("Guest");
        Developer d1 = new Developer(devName, devProjects);
        Admin a1 = new Admin(adminName, adminProjects, adminKey);

        // Store in User array
        User[] users = { u1, d1, a1 };

        int totalClearance = 0;

        // Sum clearance levels
        for (User u : users) {
            totalClearance += u.getClearanceLevel();
        }

        // Check Admin and print adminKey
        for (User u : users) {
            if (u instanceof Admin) {
                Admin admin = (Admin) u;
                System.out.println(admin.getAdminKey());
            }
        }

        // Print total clearance
        System.out.println(totalClearance);

        sc.close();
    }
}
