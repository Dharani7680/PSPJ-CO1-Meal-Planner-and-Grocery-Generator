import java.util.*;
import java.util.function.Predicate;

public class CO6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, List<String>> ingredients = new HashMap<>();

        ingredients.put("idli", Arrays.asList("Rice", "Urad Dal"));
        ingredients.put("dosa", Arrays.asList("Rice", "Urad Dal", "Oil"));
        ingredients.put("rice", Arrays.asList("Rice"));
        ingredients.put("dal", Arrays.asList("Dal", "Onion"));
        ingredients.put("chapati", Arrays.asList("Wheat Flour", "Oil"));
        ingredients.put("upma", Arrays.asList("Rava", "Onion", "Oil"));

        List<String> meals = new ArrayList<>();

        System.out.print("Enter number of food items: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("Enter food item " + (i + 1) + ": ");
            meals.add(sc.nextLine().toLowerCase().trim());
        }

        // Functional interface with lambda expression
        Predicate<String> isAvailable = food -> ingredients.containsKey(food);

        List<String> groceries = new ArrayList<>();

        for (String food : meals) {
            if (isAvailable.test(food)) {
                groceries.addAll(ingredients.get(food));
            } else {
                System.out.println("Food not found: " + food);
            }
        }

        System.out.println("\n--- GROCERY LIST ---");

        // Stream: remove duplicates, sort, and display
        groceries.stream()
                .distinct()
                .sorted()
                .forEach(item -> System.out.println(item));

        sc.close();
    }
}