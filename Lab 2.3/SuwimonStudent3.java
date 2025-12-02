import java.util.Scanner;

class Student {
    String studentId;
    String name;
    static int studentCount = 0;

    Student(String id, String name) {
        this.studentId = id;
        this.name = name;
        studentCount++;
    }
}

public class SuwimonStudent3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String id = sc.nextLine();
            String fullName = sc.nextLine();
            new Student(id, fullName);
        }

        System.out.println(Student.studentCount);
        sc.close();
    }
}
