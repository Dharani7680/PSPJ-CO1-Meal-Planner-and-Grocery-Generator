import java.util.Scanner;
class ArthematicOperation{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers");
        double num1 = sc.nextDouble();
        double num2= sc.nextDouble();
        double sum=num1+num2;
        double sub=num1-num2;
        double mult=num1*num2;
        double divi=num1/num2;
        System.out.println("Sum of two numbers is "+sum);
        System.out.println("Subtraction of two numbers is"+sub);
        System.out.println("Multiplication of two numbers"+mult);
        System.out.println("Division of two numbers" +divi);
        

    }
}