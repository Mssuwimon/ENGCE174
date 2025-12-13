import java.util.Scanner;

class Schedule {
    private int hour;

    public Schedule(int hour) {
        this.hour = hour;
    }

    public Schedule(Schedule other) {
        this.hour = other.hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }
}

class EmployeeSchedule {
    private String name;
    private Schedule schedule;

    public EmployeeSchedule(String name, Schedule schedule) {
        this.name = name;
        this.schedule = new Schedule(schedule);
    }

    public EmployeeSchedule(EmployeeSchedule other) {
        this.name = other.name;
        this.schedule = new Schedule(other.schedule);
    }

    public void displaySchedule() {
        System.out.println(name + ": " + schedule.getHour() + ":00");
    }

    public Schedule getSchedule() {
        return schedule;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int initialHour = Integer.parseInt(sc.nextLine());
        int newHour = Integer.parseInt(sc.nextLine());

        Schedule sch = new Schedule(initialHour);

        EmployeeSchedule emp1 = new EmployeeSchedule(name, sch);
        EmployeeSchedule emp2 = new EmployeeSchedule(emp1);

        emp1.getSchedule().setHour(newHour);

        emp1.displaySchedule();
        emp2.displaySchedule();

        sc.close();
    }
}
