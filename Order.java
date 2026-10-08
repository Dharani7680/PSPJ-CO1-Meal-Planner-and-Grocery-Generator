public class Order {
public static double calculateorder(double price) {
    return price; }
public static double calculateOrder(double price, int quantity) {
return price * quantity;
}
public static double calculateorder(double price,int quantity,double discount) {
    double total = price*quantity;
    return total - total*discount/100;
}
public static void main(String[] args) {
    double order1 = calculateorder(100.0);
    double order2 = calculateOrder(50.0, 3);
    double order3 = calculateorder(20.0, 5, 10.0);

    System.out.println("Order 1: " + order1);
    System.out.println("Order 2: " + order2);
    System.out.println("Order 3: " + order3);

}
}

