import java.util.Scanner;

public class AdmissionEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter entrance score");
        int score = sc.nextInt();
        if (score >= 60) {
            System.out.println("Student is eligible for the  admission");

        }
    }
}
