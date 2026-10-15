import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class CO5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many food items do you want? ");
        int n = Integer.parseInt(sc.nextLine());

        String[] foods = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter food item " + (i + 1) + ": ");
            foods[i] = sc.nextLine().trim();
        }

        System.out.print("Enter a food item to search: ");
        String searchFood = sc.nextLine().trim();

        boolean found = false;

        for (String food : foods) {
            if (food.equalsIgnoreCase(searchFood)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(searchFood + " is in your meal plan.");
        } else {
            System.out.println(searchFood + " is not in your meal plan.");
        }

        Arrays.sort(foods, String.CASE_INSENSITIVE_ORDER);

        System.out.println("\n--- SORTED MEAL PLAN ---");
        for (String food : foods) {
            System.out.println(food);
        }

        try {
            FileWriter writer = new FileWriter("MealPlan.txt");

            writer.write("WEEKLY MEAL PLAN\n");
            for (String food : foods) {
                writer.write(food + "\n");
            }

            writer.close();
            System.out.println("\nMeal plan saved to MealPlan.txt");

        } catch (IOException e) {
            System.out.println("Error saving the meal plan.");
        }

        sc.close();
    }
}