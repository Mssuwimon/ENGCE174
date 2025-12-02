import java.util.Scanner;

public class SuwimonGrade4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter score: ");
        int score = sc.nextInt();

        if (score >= 80 && score <= 100) {
            System.out.println("A");
        } else if (score >= 70) {
            System.out.println("B");
        } else if (score >= 60) {
            System.out.println("C");
        } else if (score >= 50) {
            System.out.println("D");
        } else if (score >= 0) {
            System.out.println("F");
        } else {
            System.out.println("Error: Score must be between 0-100.");
        }

        sc.close();
    }
}
