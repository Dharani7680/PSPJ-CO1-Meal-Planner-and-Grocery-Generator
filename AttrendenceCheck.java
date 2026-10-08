import java.util.Scanner;

public class AttrendenceCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter attendence percentage");
        double attendence = sc.nextDouble();

        if (attendence >= 75) {
            System.out.println("Eligible for examination");
            ;
        } else {
            System.out.println("Not eligible for the examination");
        }
    }

}
