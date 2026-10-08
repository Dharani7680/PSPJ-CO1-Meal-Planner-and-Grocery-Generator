class RestaurantTax {

    static double getTaxRate() {
        return 8.0;
    }

    public static void main(String[] args) {
        double tax = getTaxRate();

        System.out.println("Tax Rate: " + tax + "%");
    }
}