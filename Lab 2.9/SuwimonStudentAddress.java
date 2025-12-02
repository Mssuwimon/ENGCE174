import java.util.Scanner;

class Address {
    String street, city, zipCode;

    Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    String getFullAddress() {
        return street + ", " + city + ", " + zipCode;
    }
}

class Student {
    String name;
    Address address;

    Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    void displayProfile() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address.getFullAddress());
    }
}

public class SuwimonStudentAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String street = sc.nextLine();
        String city = sc.nextLine();
        String zip = sc.nextLine();

        Address addr = new Address(street, city, zip);
        Student s = new Student(name, addr);
        s.displayProfile();
        sc.close();
    }
}
