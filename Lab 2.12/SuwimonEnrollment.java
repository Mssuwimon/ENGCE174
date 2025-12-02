import java.util.Scanner;

class Course {
    String courseId;
    String courseName;

    Course(String id, String name) {
        this.courseId = id;
        this.courseName = name;
    }

    String getCourseInfo() {
        return courseId + ": " + courseName;
    }
}

class Student {
    String studentName;
    Course enrolledCourse;

    Student(String name, Course course) {
        this.studentName = name;
        this.enrolledCourse = course;
    }

    void displayEnrollment() {
        System.out.println("Student: " + studentName);
        System.out.println("Enrolled in: " + enrolledCourse.getCourseInfo());
    }
}

public class SuwimonEnrollment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String courseId = sc.nextLine();
        String courseName = sc.nextLine();
        String studentName = sc.nextLine();

        Course c = new Course(courseId, courseName);
        Student s = new Student(studentName, c);
        s.displayEnrollment();
        sc.close();
    }
}

