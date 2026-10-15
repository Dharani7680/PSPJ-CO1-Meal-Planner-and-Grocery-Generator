import java.util.Scanner;

public class CO2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many food items do you want? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("\nEnter food item " + i + ": ");
            String food = sc.nextLine().toLowerCase();

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            if (quantity <= 0) {
                System.out.println("Invalid quantity!");
            } else {
                switch (food) {
                    case "idli":
                        System.out.println("Ingredients: Rice, Urad Dal, Salt");
                        break;

                    case "dosa":
                        System.out.println("Ingredients: Rice, Urad Dal, Oil");
                        break;

                    case "rice":
                        System.out.println("Ingredients: Rice, Water, Salt");
                        break;

                    case "dal":
                        System.out.println("Ingredients: Dal, Onion, Tomato, Salt");
                        break;

                    case "chapati":
                        System.out.println("Ingredients: Wheat Flour, Water, Salt");
                        break;

                    case "upma":
                        System.out.println("Ingredients: Rava, Onion, Oil, Salt");
                        break;

                    default:
                        System.out.println("Food item not available.");
                }

                if (quantity > 0) {
                    System.out.println("Quantity: " + quantity);
                }
            }
        }

        sc.close();
    }
}