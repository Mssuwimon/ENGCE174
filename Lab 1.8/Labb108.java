import java.util.Scanner;
public class Labb108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }
        int max = data[0];
        for (int i = 1; i < n; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        System.out.println(max);
    }
}