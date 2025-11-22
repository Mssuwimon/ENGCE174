import java.util.Scanner;
public class Labb109{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }
        double avg = sum / n;
        System.out.println(avg);
    }
}