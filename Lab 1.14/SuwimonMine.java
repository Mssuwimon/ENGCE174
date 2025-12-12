import java.util.InputMismatchException;
import java.util.Scanner;

public class SuwimonMine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int numRows = inputInt(scanner, "Enter number of rows: ");
            int numCols = inputInt(scanner, "Enter number of columns: ");

            char[][] mineBoard = getBoard(scanner, numRows, numCols);

            int targetRow = inputInt(scanner, "Enter target row (0-indexed): ");
            int targetCol = inputInt(scanner, "Enter target column (0-indexed): ");

            if (targetRow < 0 || targetRow >= numRows || targetCol < 0 || targetCol >= numCols) {
                System.out.println("Error: Target coordinates out of bounds.");
            } else {
                showResult(mineBoard, targetRow, targetCol);
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers.");
        } finally {
            scanner.close();
        }
    }

    private static int inputInt(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    private static char[][] getBoard(Scanner scanner, int rows, int cols) {
        char[][] board = new char[rows][cols];
        scanner.nextLine();

        System.out.println("Enter the map row by row (* for mine, . for empty):");

        for (int r = 0; r < rows; r++) {
            String line = "";
            while (line.length() != cols) {
                line = scanner.nextLine();
                if (line.length() != cols) {
                    System.out.println("Invalid length! Please enter exactly " + cols + " characters.");
                }
            }
            for (int c = 0; c < cols; c++) {
                char ch = line.charAt(c);
                if (ch != '*' && ch != '.') {
                    System.out.println("Invalid character detected! Use '*' or '.' only.");
                    c = -1;
                    line = "";
                } else {
                    board[r][c] = ch;
                }
            }
        }
        return board;
    }

    private static void showResult(char[][] board, int row, int col) {
        if (board[row][col] == '*') {
            System.out.println("Mine");
        } else {
            int adjacentMines = countAdjacentMines(board, row, col);
            System.out.println(adjacentMines);
        }
    }

    private static int countAdjacentMines(char[][] board, int row, int col) {
        int count = 0;
        int[][] directions = {
            {-1, -1}, {-1, 0}, {-1, 1},
            { 0, -1},          { 0, 1},
            { 1, -1}, { 1, 0}, { 1, 1}
        };

        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];

            if (newRow >= 0 && newRow < board.length && newCol >= 0 && newCol < board[0].length) {
                if (board[newRow][newCol] == '*') {
                    count++;
                }
            }
        }
        return count;
    }
}
