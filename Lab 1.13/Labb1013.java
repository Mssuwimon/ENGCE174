import java.util.Scanner;
public class Labb1013{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] serverGrid = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                serverGrid[i][j] = sc.nextInt();
            }
        }
        int onlineCount = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (serverGrid[i][j] == 1) {
                    onlineCount++;
                }
            }
        }
        System.out.println(onlineCount);
    }
}