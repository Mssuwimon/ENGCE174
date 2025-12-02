import java.util.Scanner;

class Student {
    String studentId;
    String name;

    void displayInfo() {
        System.out.println(studentId);
        System.out.println(name);
    }
}

public class SuwimonStudent2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String fullName = sc.nextLine();

        Student student = new Student();
        student.studentId = id;
        student.name = fullName;

        student.displayInfo();
        sc.close();
    }
}
