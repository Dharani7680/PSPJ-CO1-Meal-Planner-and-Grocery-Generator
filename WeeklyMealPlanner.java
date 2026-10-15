import java.util.*;
import java.io.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Meal {
    private String day;
    private String mealType;
    private List<String> foodNames;

    public Meal(String day, String mealType, List<String> foodNames) {
        this.day = day;
        this.mealType = mealType;
        this.foodNames = new ArrayList<>(foodNames);
    }

    public String getDay() {
        return day;
    }

    public String getMealType() {
        return mealType;
    }

    public List<String> getFoodNames() {
        return foodNames;
    }

    public void displayMeal() {
        System.out.println(day + " - " + mealType + ": "
                + String.join(", ", foodNames));
    }
}

public class WeeklyMealPlanner {

    static Scanner sc = new Scanner(System.in);

    static Map<String, List<String>> ingredients = new HashMap<>();

    static {
        ingredients.put("idli", Arrays.asList("Rice", "Urad Dal"));
        ingredients.put("dosa", Arrays.asList("Rice", "Urad Dal", "Oil"));
        ingredients.put("rice", Arrays.asList("Rice"));
        ingredients.put("dal", Arrays.asList("Dal", "Onion"));
        ingredients.put("chapati", Arrays.asList("Wheat Flour", "Oil"));
        ingredients.put("upma", Arrays.asList("Rava", "Onion", "Oil"));
        ingredients.put("poha", Arrays.asList("Poha", "Onion", "Peanuts"));
        ingredients.put("vegetable curry",
                Arrays.asList("Potato", "Onion", "Tomato", "Oil"));
        ingredients.put("curd rice", Arrays.asList("Rice", "Curd"));
        ingredients.put("biryani",
                Arrays.asList("Rice", "Onion", "Tomato", "Spices", "Oil"));
    }

    static String[] days = {
            "Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday"
    };

    static String[] mealTypes = { "Breakfast", "Lunch", "Dinner" };

    // CO3: Get ingredients for a food item
    static List<String> getIngredients(String food) {
        return ingredients.getOrDefault(
                food.toLowerCase().trim(),
                Collections.emptyList());
    }

    // CO5: Search for a food in the weekly plan
    static void searchMeal(List<Meal> meals, String search) {
        boolean found = false;

        for (Meal meal : meals) {
            for (String food : meal.getFoodNames()) {
                if (food.equalsIgnoreCase(search.trim())) {
                    System.out.println(meal.getDay() + " - "
                            + meal.getMealType() + ": " + food);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Food not found in your weekly plan.");
        }
    }

    // CO5: Save grocery list to a file
    static void saveGroceries(List<String> groceries) {
        try (FileWriter writer = new FileWriter("GroceryList.txt")) {
            writer.write("WEEKLY GROCERY LIST\n");

            for (String item : groceries) {
                writer.write(item + "\n");
            }

            System.out.println("Grocery list saved to GroceryList.txt");

        } catch (IOException e) {
            System.out.println("Error saving grocery list: " + e.getMessage());
        }
    }

    // Read and validate multiple comma-separated foods
    static List<String> readFoods(String mealType) {
        while (true) {
            System.out.print(mealType + ": ");
            String input = sc.nextLine();

            List<String> foods = new ArrayList<>();
            boolean valid = true;

            String[] enteredFoods = input.split(",");

            for (String item : enteredFoods) {
                String food = item.trim().toLowerCase();

                if (food.isEmpty() || !ingredients.containsKey(food)) {
                    System.out.println("Invalid food: " + item.trim());
                    valid = false;
                    break;
                }

                foods.add(food);
            }

            if (valid && !foods.isEmpty()) {
                return foods;
            }

            System.out.println("Please enter valid food names separated by commas.");
            System.out.println("Available foods: " + ingredients.keySet());
        }
    }

    public static void main(String[] args) {

        List<Meal> weeklyMeals = new ArrayList<>();

        System.out.println("==================================");
        System.out.println(" WEEKLY MEAL PLANNER");
        System.out.println("==================================");
        System.out.println("Available foods: " + ingredients.keySet());
        System.out.println("Enter one or more foods separated by commas.");

        // CO1 and CO2: Input, loops, and conditions
        for (String day : days) {
            System.out.println("\n--- " + day + " ---");

            for (String type : mealTypes) {
                List<String> foods = readFoods(type);
                weeklyMeals.add(new Meal(day, type, foods));
            }
        }

        System.out.println("\n========== YOUR WEEKLY MEAL PLAN ==========");

        for (Meal meal : weeklyMeals) {
            meal.displayMeal();
        }

        // CO5: Search feature
        System.out.print("\nEnter a food name to search: ");
        String search = sc.nextLine().trim();
        searchMeal(weeklyMeals, search);

        // CO6: Functional interface and lambda expression
        Predicate<String> isAvailable = food -> ingredients.containsKey(food);

        List<String> groceryItems = new ArrayList<>();

        for (Meal meal : weeklyMeals) {
            for (String food : meal.getFoodNames()) {
                if (isAvailable.test(food)) {
                    groceryItems.addAll(getIngredients(food));
                }
            }
        }

        // CO6: Stream operations remove duplicates and sort
        List<String> groceries = groceryItems.stream()
                .distinct()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList());

        System.out.println("\n========== WEEKLY GROCERY LIST ==========");

        groceries.forEach(item -> System.out.println("- " + item));

        // Save grocery list
        saveGroceries(groceries);

        System.out.println("\nWeekly meal plan completed!");

        sc.close();
    }
}