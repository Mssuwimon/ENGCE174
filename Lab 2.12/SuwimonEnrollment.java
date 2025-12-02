import java.util.Scanner;

class Course {
    private String courseId;
    private String courseName;

    Course(String id, String name) {
        this.courseId = id;
        this.courseName = name;
    }

    public String getCourseInfo() {
        return courseId + ": " + courseName;
    }
}

class Student {
    private String studentName;
    private Course enrolledCourse;

    Student(String name, Course course) {
        this.studentName = name;
        this.enrolledCourse = course;
    }

    public void displayEnrollment() {
        System.out.println("Student: " + studentName);
        System.out.println("Enrolled in: " + enrolledCourse.getCourseInfo());
    }
}

public class SuwimonEnrollment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(""); // ป้องกัน whitespace/format issue
        String courseId = sc.nextLine();
        String courseName = sc.nextLine();
        String studentName = sc.nextLine();

        Course course = new Course(courseId, courseName);
        Student student = new Student(studentName, course);
        student.displayEnrollment();

        sc.close();
    }
}
