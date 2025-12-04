import java.util.Scanner;

class Player {
    private int score;

    // Constructor
    public Player(int initialScore) {
        this.score = initialScore;
    }

    // Get score
    public int getScore() {
        return score;
    }

    // Set score
    public void setScore(int newScore) {
        this.score = newScore;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initialScore = sc.nextInt();
        int updatedScore = sc.nextInt();

        Player player = new Player(initialScore);
        player.setScore(updatedScore);

        System.out.println(player.getScore());
    }
}
