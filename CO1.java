import java.util.Scanner;

public class CO1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String foodName;
        int quantity;
        double price, totalCost;

        System.out.println("WEEKLY MEAL PLANNER");

        System.out.print("Enter food item: ");
        foodName = sc.nextLine();

        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();

        System.out.print("Enter price per item: ");
        price = sc.nextDouble();

        totalCost = quantity * price;

        System.out.println("\n--- MEAL DETAILS ---");
        System.out.println("Food Item: " + foodName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per item: Rs. " + price);
        System.out.println("Total Cost: Rs. " + totalCost);

        sc.close();
    }
}