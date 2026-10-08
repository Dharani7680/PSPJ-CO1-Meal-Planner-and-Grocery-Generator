import java.util.Scanner;

public class CourseRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("prerequisite completed ? (true/false) :");
        boolean prerequisite = sc.nextBoolean();

        System.out.println("Enter attendence : ");
        double attendence = sc.nextDouble();
        if (prerequisite && attendence >= 75) {
            System.out.println("Course registration completed");
        } else {
            System.out.println("Course registration denied");
        }
    }

}
