public class Operators {
    public static void main(String[] args) {

        int a =17,b =5;

        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Reminder = " + (a % b));

        int neg = -a;
        boolean open = true;
        boolean shut = !open;
        int count = 0;
        count++;
        System.out.println("neg = " + neg + " , shut = " + shut + " , count = " + count);
        String parity = (a % 2 == 0) ? "even" : "odd";
        System.out.println("a is " + parity);
    }
}
