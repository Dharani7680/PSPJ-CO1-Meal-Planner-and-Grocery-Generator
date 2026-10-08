import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.print("Grade : A+");
        } else if (marks >= 80) {
            System.out.print("Grade : A");
        } else if (marks >= 70) {
            System.out.print("Grade : B");
        } else if (marks >= 60) {
            System.out.print("Grade : C");
        } else if (marks >= 50) {
            System.out.print("Grade : D");
        } else {
            System.out.print("Grade : e");
        }
    }

}
