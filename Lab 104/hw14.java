package homework;

import java.util.Scanner;

public class hw14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = inputInt(sc, "Enter number of rows : ");
        int c = inputInt(sc, "Enter number of columns : ");

        char[][] board = getBoard(sc, r, c);

        int tr = inputInt(sc, "Enter target row (0-indexed): ");
        int tc = inputInt(sc, "Enter target column (0-indexed): ");

        showResult(board, tr, tc);

        sc.close();
    }

    private static int inputInt(Scanner sc, String msg) {
        System.out.print(msg);
        return sc.nextInt();
    }

    private static char[][] getBoard(Scanner sc, int r, int c) {
        char[][] board = new char[r][c];
        sc.nextLine();  

        System.out.println("Enter the map row by row (* for mine, . for empty):");

        for (int i = 0; i < r; i++) {
            String line = "";
            while (line.length() != c) {
                line = sc.nextLine();
                if (line.length() != c) {
                    System.out.println("Invalid length! Please enter exactly " + c + " characters.");
                }
            }
            for (int j = 0; j < c; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        return board;
    }

    private static void showResult(char[][] board, int r, int c) {
        if (board[r][c] == '*') {
            System.out.println("Mine");
        } else {
            int adj = countMines(board, r, c);
            System.out.println(adj);
        }
    }

    private static int countMines(char[][] board, int r, int c) {
        int count = 0;
        int[][] dirs = {
                {-1, -1}, {-1, 0}, {-1, 1},
                { 0, -1},          { 0, 1},
                { 1, -1}, { 1, 0}, { 1, 1}
        };

        for (int[] d : dirs) {
            int nr = r + d[0];
            int nc = c + d[1];

            if (nr >= 0 && nr < board.length && nc >= 0 && nc < board[0].length) {
                if (board[nr][nc] == '*') {
                    count++;
                }
            }
        }

        return count;
    }
}