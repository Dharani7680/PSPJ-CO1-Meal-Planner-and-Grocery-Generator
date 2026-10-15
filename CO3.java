import java.util.Scanner;

public class CO3 {

    static String[] getIngredients(String food) {
        switch (food.toLowerCase()) {
            case "idli":
                return new String[] { "Rice", "Urad Dal", "Salt" };

            case "dosa":
                return new String[] { "Rice", "Urad Dal", "Oil" };

            case "rice":
                return new String[] { "Rice", "Water", "Salt" };

            case "dal":
                return new String[] { "Dal", "Onion", "Tomato", "Salt" };

            case "chapati":
                return new String[] { "Wheat Flour", "Water", "Salt" };

            case "upma":
                return new String[] { "Rava", "Onion", "Oil", "Salt" };

            default:
                return new String[] { "Ingredients not available" };
        }
    }

    static void displayIngredients(String[] ingredients) {
        for (String item : ingredients) {
            System.out.println("- " + item);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many food items do you want to plan? ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] foods = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter food item " + (i + 1) + ": ");
            foods[i] = sc.nextLine().trim();
        }

        System.out.println("\n--- YOUR MEAL PLAN ---");

        for (int i = 0; i < n; i++) {
            System.out.println("\nFood: " + foods[i]);
            System.out.println("Required ingredients:");

            String[] ingredients = getIngredients(foods[i]);
            displayIngredients(ingredients);
        }

        sc.close();
    }
}
