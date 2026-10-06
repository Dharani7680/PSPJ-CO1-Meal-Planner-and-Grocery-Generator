import java.util.Scanner;

public class MealPlannerCO1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Data Types
        String mealName;
        int people;
        int servings;
        double pricePerServing;
        boolean vegetarian;

        // Input
        System.out.print("Enter meal name: ");
        mealName = sc.nextLine();

        System.out.print("Enter number of people: ");
        people = sc.nextInt();

        System.out.print("Enter servings per person: ");
        servings = sc.nextInt();

        System.out.print("Enter price per serving: ");
        pricePerServing = sc.nextDouble();

        System.out.print("Is it vegetarian? (true/false): ");
        vegetarian = sc.nextBoolean();

        // Operators
        int totalServings = people * servings;
        double totalCost = totalServings * pricePerServing;
        double costPerPerson = totalCost / people;

        boolean budgetMeal = totalCost <= 1000;

        // Output
        System.out.println("\n----- MEAL PLAN -----");
        System.out.println("Meal Name         : " + mealName);
        System.out.println("Number of People  : " + people);
        System.out.println("Total Servings    : " + totalServings);
        System.out.println("Price per Serving : ₹" + pricePerServing);
        System.out.println("Total Cost        : ₹" + totalCost);
        System.out.println("Cost per Person   : ₹" + costPerPerson);
        System.out.println("Vegetarian        : " + vegetarian);
        System.out.println("Within ₹1000 Budget: " + budgetMeal);

       
    }
}