public class Shopping {
public static double bill(int quantity , double price) {
    return quantity * price; }
    public static void main(String[] args) {
        double total = bill(9, 20.0);
        System.out.println("Total: " + total);
    }
}

