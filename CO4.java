
import java.util.Scanner;

class Meal {
    private String foodName;
    private int quantity;

    Meal(String foodName, int quantity) {
        this.foodName = foodName;
        this.quantity = quantity;
    }

    public String getFoodName() {
        return foodName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void displayMeal() {
        System.out.println("Food Item: " + foodName);
        System.out.println("Quantity: " + quantity);
    }
}

public class CO4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter food item: ");
            String food = sc.nextLine();

            System.out.print("Enter quantity: ");
            int quantity = Integer.parseInt(sc.nextLine());

            if (quantity <= 0) {
                System.out.println("Quantity must be greater than zero.");
            } else {
                Meal meal = new Meal(food, quantity);

                System.out.println("\n--- MEAL DETAILS ---");
                meal.displayMeal();
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a whole number for quantity.");
        }

        sc.close();
    }
}