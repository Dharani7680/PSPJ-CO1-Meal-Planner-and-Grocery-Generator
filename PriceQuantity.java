import java.util.Scanner;

public class PriceQuantity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        a = sc.nextDouble();
        double b;
        b = sc.nextDouble();
        double totalCost = a * b;
        System.out.println("a=price " + a);
        System.out.println("b=quantity " + b);
        System.out.println("total cost " + totalCost);
    }
}
