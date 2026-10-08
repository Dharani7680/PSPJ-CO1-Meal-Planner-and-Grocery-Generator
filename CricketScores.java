import java.util.Scanner;
public class CricketScores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];
        // Accept scores
        System.out.println("Enter scores of 5 players:");
        for (int i = 0; i < 5; i++) {
            scores[i] = sc.nextInt();
        }

        System.out.println("Cricket Scores:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Player " + (i + 1) + ": " + scores[i]);
        }
    }
}