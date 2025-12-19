import java.util.Scanner;

class ScoreBoard {
    private final String gameTitle;
    private final int[] scoreData;

    // Shallow copy
    public ScoreBoard(String gameTitle, int[] scoreData) {
        this.gameTitle = gameTitle;
        this.scoreData = scoreData;
    }

    // Deep copy
    public ScoreBoard(ScoreBoard other) {
        this.gameTitle = other.gameTitle;
        this.scoreData = new int[other.scoreData.length];

        for (int i = 0; i < other.scoreData.length; i++) {
            this.scoreData[i] = other.scoreData[i];
        }
    }

    public void displayScores() {
        System.out.print(gameTitle + ": ");

        for (int i = 0; i < scoreData.length; i++) {
            System.out.print(scoreData[i]);

            if (i < scoreData.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextLine()) {
            return;
        }
        String gameName = sc.nextLine();

        int[] scores = new int[3];
        for (int i = 0; i < 3; i++) {
            if (sc.hasNextInt()) {
                scores[i] = sc.nextInt();
            }
        }

        // Shallow copy
        ScoreBoard sb1 = new ScoreBoard(gameName, scores);

        // Deep copy
        ScoreBoard sb2 = new ScoreBoard(sb1);

        // เปลี่ยนค่าจาก array ต้นทาง
        if (sc.hasNextInt()) {
            scores[0] = sc.nextInt();
        }

        sb1.displayScores();
        sb2.displayScores();

        sc.close();
    }
}
