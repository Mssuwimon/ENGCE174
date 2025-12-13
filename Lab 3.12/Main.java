import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

class Employee {

    private String name;
    private BigDecimal monthlySalary;

    public Employee(String name, double monthlySalary) {
        this.name = name;

        if (monthlySalary > 0) {
            this.monthlySalary = BigDecimal.valueOf(monthlySalary);
        } else {
            this.monthlySalary = BigDecimal.ZERO;
        }
    }

    public void giveRaise(double amount) {
        if (amount > 0) {
            monthlySalary = monthlySalary.add(BigDecimal.valueOf(amount));
            System.out.println("Raise applied.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    private BigDecimal getAnnualSalary() {
        return monthlySalary.multiply(BigDecimal.valueOf(12));
    }

    public BigDecimal calculateTax(double taxRate) {
        return getAnnualSalary()
                .multiply(BigDecimal.valueOf(taxRate))
                .setScale(1, RoundingMode.HALF_UP);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double monthlySalary = sc.nextDouble();
        double taxRate = sc.nextDouble();
        double raiseAmount = sc.nextDouble();

        Employee emp = new Employee(name, monthlySalary);

        System.out.println("Tax (Before): " + emp.calculateTax(taxRate));

        emp.giveRaise(raiseAmount);

        System.out.println("Tax (After): " + emp.calculateTax(taxRate));

        sc.close();
    }
}
