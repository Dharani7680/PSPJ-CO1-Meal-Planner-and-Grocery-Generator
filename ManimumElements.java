import java.util.Scanner;

public class ManimumElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students");
        int n = sc.nextInt();
        int[] marks = new int[n];

        System.out.println("Enter the marks of the students");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        int min = marks[0];
        for (int i = 1; i < n; i++) {
            if (marks[i] < min) {
                min = marks[i];
            }
        }
        System.out.println("Minimum marks of the student is " + min);
    }

}
