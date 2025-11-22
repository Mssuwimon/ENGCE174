import java.util.Scanner;
public class Labb1014{
    static final int[] dr = {-1, -1, -1,  0,  0,  1,  1,  1};
    static final int[] dc = {-1,  0,  1, -1,  1, -1,  0,  1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        char[][] grid = new char[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }
        int targetR = sc.nextInt();
        int targetC = sc.nextInt();
        if (grid[targetR][targetC] == '*') {
            System.out.println("Mine");
            return; 
        }
        int mines = 0;
        for (int i = 0; i < 8; i++) {
            int nextR = targetR + dr[i];
            int nextC = targetC + dc[i];
            if (nextR >= 0 && nextR < R && nextC >= 0 && nextC < C && grid[nextR][nextC] == '*') {
                mines++;
            }
         }

         System.out.println(mines);
    }
}
