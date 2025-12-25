import java.util.Scanner;

class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getStatus() {
        return "Person: " + name;
    }
}

class Student extends Person {
    protected int studentId;

    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }

    @Override
    public String getStatus() {
        return "Student: " + name + ", ID: " + studentId;
    }
}

class Employee extends Person {
    protected double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public void applyBonus(double bonus) {
        this.salary += bonus;
    }

    @Override
    public String getStatus() {
        return "Employee: " + name + ", Salary: " + salary;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Student
        String studentName = sc.nextLine();
        int studentId = Integer.parseInt(sc.nextLine());

        // Employee
        String employeeName = sc.nextLine();
        double salary = Double.parseDouble(sc.nextLine());

        Person s = new Student(studentName, studentId);
        Person e = new Employee(employeeName, salary);

        Person[] people = { s, e };

        // Downcasting + instanceof
        for (Person p : people) {
            if (p instanceof Employee) {
                Employee emp = (Employee) p; // downcast
                emp.applyBonus(1000.0);
            }
        }

        // แสดงผล
        for (Person p : people) {
            System.out.println(p.getStatus());
        }

        sc.close();
    }
}
