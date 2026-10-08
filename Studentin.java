import java.util.Scanner;

public class Studentin {

    int studentId;
    String studentName;
    String department;
    String mobile;

    public void displayStudent() {
        System.out.println("\n---------- Student Details ----------");
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Department   : " + department);
        System.out.println("Mobile       : " + mobile);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Studentin s = new Studentin();

        System.out.print("Enter Student ID: ");
        s.studentId = sc.nextInt();
        sc.nextLine(); // Consume the newline

        System.out.print("Enter Student Name: ");
        s.studentName = sc.nextLine();

        System.out.print("Enter Department: ");
        s.department = sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        s.mobile = sc.nextLine();

        s.displayStudent();

        sc.close();
    }
}
