import java.util.Scanner;

class Car {
    private String model;
    private int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }
}

public class SuwimonCar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(""); // ทำให้ไม่มีช่องว่าง/format issue
        String model = sc.nextLine();
        int year = sc.nextInt();
        int newYear = sc.nextInt();

        Car car = new Car(model, year);
        car.setYear(newYear);

        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());

        sc.close();
    }
}
