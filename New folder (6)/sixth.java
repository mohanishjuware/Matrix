import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        Map<String, Integer> cart = new HashMap<>();
        cart.put("Shoes", 1500);
        cart.put("Bag", 1200);
        cart.put("Watch", 2500);

        int total = 0;
        for (Map.Entry<String, Integer> item : cart.entrySet()) {
            System.out.println(item.getKey() + ": ₹" + item.getValue());
            total += item.getValue();
        }

        System.out.println("Total = ₹" + total);
    }
}
