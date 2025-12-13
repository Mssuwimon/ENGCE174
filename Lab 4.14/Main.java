import java.util.Scanner;

// คลาส ScoreBoard
class ScoreBoard {
    private final String gameName; // ชื่อเกม (Immutable)
    private final int[] scores;    // คะแนน (Array) 

    // Constructor หลัก (Shallow Copy)
    public ScoreBoard(String gameName, int[] scores) {
        this.gameName = gameName;
        this.scores = scores; // Shallow copy: แค่ reference ไม่สร้าง array ใหม่
    }

    // Copy Constructor (Deep Copy)
    public ScoreBoard(ScoreBoard other) {
        this.gameName = other.gameName;
        this.scores = new int[other.scores.length]; // สร้าง array ใหม่
        for (int i = 0; i < other.scores.length; i++) {
            this.scores[i] = other.scores[i]; // คัดลอกค่าทีละตัว
        }
    }

    // Method แสดงผล
    public void displayScores() {
        System.out.print(this.gameName + ": ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i]);
            if (i != scores.length - 1) System.out.print(", ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String gameName = scanner.nextLine(); // รับชื่อเกม

        int[] originalScores = new int[3];
        for (int i = 0; i < 3; i++) {
            originalScores[i] = scanner.nextInt(); // คะแนนเริ่มต้น
        }

        ScoreBoard sb1 = new ScoreBoard(gameName, originalScores); // Shallow Copy
        ScoreBoard sb2 = new ScoreBoard(sb1); // Deep Copy

        int modifiedScore = scanner.nextInt(); // คะแนนใหม่ที่แก้ไข array ต้นฉบับ
        originalScores[0] = modifiedScore;

        sb1.displayScores(); // Shallow Copy: จะเห็นการเปลี่ยนแปลง
        sb2.displayScores(); // Deep Copy: จะไม่เปลี่ยนแปลง

        scanner.close();
    }
}
