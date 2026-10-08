import java.util.Scanner;

public class DataTypeInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        byte age = sc.nextByte();

        System.out.print("Enter Salary: ");
        int salary = sc.nextInt();

        System.out.print("Enter Percentage: ");
        float percentage = sc.nextFloat();

        System.out.print("Enter Grade: ");
        char grade = sc.next().charAt(0);

        System.out.print("Enter Passed (true/false): ");
        boolean passed = sc.nextBoolean();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.println("\n------ Student Details ------");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Salary     : " + salary);
        System.out.println("Percentage : " + percentage);
        System.out.println("Grade      : " + grade);
        System.out.println("Passed     : " + passed);

        sc.close();
    }
}
