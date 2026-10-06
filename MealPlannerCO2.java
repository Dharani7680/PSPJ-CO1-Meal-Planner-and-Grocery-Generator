import java.util.Scanner;

public class MealPlannerCO2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== MEAL PLANNER AND GROCERY GENERATOR =====");

        System.out.print("Enter number of people: ");
        int people = sc.nextInt();

        System.out.print("Enter budget: ");
        double budget = sc.nextDouble();

        // IF-ELSE
        if (people > 0) {
            System.out.println("Number of people is valid.");
        } else {
            System.out.println("Invalid number of people.");
        }

        // ELSE-IF
        if (budget >= 2000) {
            System.out.println("Budget Category: High");
        } else if (budget >= 1000) {
            System.out.println("Budget Category: Medium");
        } else {
            System.out.println("Budget Category: Low");
        }

        // SWITCH
        System.out.println("\nChoose Meal Type:");
        System.out.println("1. Breakfast");
        System.out.println("2. Lunch");
        System.out.println("3. Dinner");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected Breakfast.");
                break;

            case 2:
                System.out.println("You selected Lunch.");
                break;

            case 3:
                System.out.println("You selected Dinner.");
                break;

            default:
                System.out.println("Invalid meal choice.");
        }

        // FOR LOOP
        System.out.println("\nMeal Plan for the Week:");

        for (int day = 1; day <= 7; day++) {
            System.out.println("Day " + day + ": Meal planned");
        }

        // WHILE LOOP
        System.out.println("\nGrocery Items:");

        int item = 1;

        while (item <= 5) {
            System.out.println("Grocery Item " + item);
            item++;
        }

        // DO-WHILE LOOP
        int servings = 1;

        System.out.println("\nServings:");

        do {
            System.out.println("Serving " + servings);
            servings++;
        } while (servings <= people);

        sc.close();
    }
}