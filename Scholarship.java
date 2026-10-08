import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter CGPA :");
        double cgpa = sc.nextDouble();

        System.out.println("Enter Attendence : ");
        double attendence = sc.nextDouble();

        if (cgpa >= 85) {
            if (attendence >= 75) {
                System.out.println("Eligible for Scholarship");
            } else {
                System.out.println("attendence requirement not satisfied");
            }
        }
    }

}
