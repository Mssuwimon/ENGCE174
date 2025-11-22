import java.util.Scanner;

public class Labb107 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int howMany = myScanner.nextInt();
        int sumAll = 0;

        for(int i = 0; i < howMany; i++){
            int eachNum = myScanner.nextInt();
            sumAll += eachNum;
        }

        System.out.println(sumAll);

        myScanner.close();
    }
}
