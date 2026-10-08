import java.util.Scanner;

public class MaximumElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of the student");
        int n = sc.nextInt();
        int[] marks = new int[n];
        System.out.println("Enter the marks of the student");

        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        int max = marks[0];
        for (int i = 1; i < n; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }

        System.out.println("Maximum marks of the student is " + max);
    }
}
