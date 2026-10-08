import java.util.Scanner;

public class ExanResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Java marks :");
        int java = sc.nextInt();

        System.out.print("DS marks");
        int ds = sc.nextInt();

        System.out.print("Maths marks");
        int maths = sc.nextInt();

        if (java >= 40 && ds >= 40 && maths >= 40) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

}
