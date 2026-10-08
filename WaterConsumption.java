import java.util.Scanner;
public class WaterConsumption {
static int calculateTotal(int morningUsage, int eveningUsage) {
     return morningUsage + eveningUsage;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

   System.out.print("Enter morning water usage in liters ");
   int morningUsage = sc.nextInt();
   System.out.print("Enter evening water usage in liters ");
   int eveningUsage = sc.nextInt();
   int total = calculateTotal(morningUsage, eveningUsage);
   System.out.println("Total Water Consumption: " + total + " litres");
    }
}