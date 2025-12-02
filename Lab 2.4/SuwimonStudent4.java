import java.util.Scanner;

class Student {
    String name;
    int midtermScore;
    int finalScore;

    Student(String name, int mid, int fin) {
        this.name = name;
        this.midtermScore = mid;
        this.finalScore = fin;
    }

    double calculateAverage() {
        return (midtermScore + finalScore) / 2.0;
    }

    void displaySummary() {
        System.out.println("Name: " + name);
        System.out.println("Average Score: " + calculateAverage());
        System.out.println("Status: " + (calculateAverage() >= 50.0 ? "Pass" : "Fail"));
    }
}

public class SuwimonStudent4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int mid = sc.nextInt();
        int fin = sc.nextInt();

        Student s = new Student(name, mid, fin);
        s.displaySummary();
        sc.close();
    }
}
