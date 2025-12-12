import java.util.Scanner;

class Employee {
    private String empId;       // read-only
    private String dept;        // writable

    public Employee(String empId, String dept) {
        this.empId = empId;
        this.dept = dept;
    }

    public String getEmployeId() {
        return this.empId;
    }

    public String getDepartment() {
        return this.dept;
    }

    public void setDepartment(String newDept) {
        this.dept = newDept;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id = sc.nextLine();
        String depStart = sc.nextLine();
        String depNew = sc.nextLine();

        Employee emp = new Employee(id, depStart);
        emp.setDepartment(depNew);

        System.out.println(emp.getEmployeId());
        System.out.println(emp.getDepartment());

        sc.close();
    }
}
