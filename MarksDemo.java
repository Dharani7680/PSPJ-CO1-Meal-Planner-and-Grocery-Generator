import java.util.Scanner;

class MarksDemo {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks of 3 subjects");
        System.out.println("Enter marks of subject 1");
        double marks1=sc.nextDouble();
         = sc.nextDouble();
        System.out.println("Enter marks of subject 2");
        double marks2 = sc.nextDouble();
        System.out.println("Enter marks of subject 3");
        double marks3 = sc.nextDouble();
        double totalMarks = marks1+marks2+marks3;
        System.out.println("Total marks of 3 subjects is"+totalMarks);
        System.out.println("Average Marks of 3 subjects"+totalMarks/3);
    }
}