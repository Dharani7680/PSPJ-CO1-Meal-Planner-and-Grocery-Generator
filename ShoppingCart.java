import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.TreeMap;

public class ShoppingCart {
    public static void main(String[] args) {
        ArrayList<String> cart = new ArrayList<>();
        cart.add("laptop");
        cart.add("mouse");
        cart.add("keyboard");
        cart.add("mouse");
        System.out.println("=========================ARRAYLIST=======================");
        System.out.println("Shopping Cart: " + cart);
        System.out.println("cart");
        System.out.println("First Item: " + cart.get(0));
        System.out.println("Number of Items: " + cart.get(0));
        cart.remove("keyboard");
        System.out.println("After removing keyboard");
        System.out.println(cart);
       //==============================
       // 2.HASHSET-PRODUCT CATEGORIES
       //==============================
        HashSet<String> categories = new HashSet<>();
        categories.add("Electronics");
        categories.add("Accessories");
        categories.add("Electronics");
        categories.add("Accessories");
        categories.add("Furniture");
        System.out.println("=========================HASHSET=======================");
        System.out.println("Product Categories: ");
        System.out.println(categories);

        System.out.println("Number of unique categories: " + categories.size());

    }
}
