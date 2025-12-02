import java.util.Scanner;

class Student {
    String studentId;
    String name;
}

public class SuwimonStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id = sc.nextLine();
        String fullName = sc.nextLine();

        Student student = new Student();
        student.studentId = id;
        student.name = fullName;

        System.out.println(student.studentId);
        System.out.println(student.name);

        sc.close();
    }
}
