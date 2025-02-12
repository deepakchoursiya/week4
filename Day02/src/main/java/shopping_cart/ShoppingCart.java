package shopping_cart;


import java.util.*;

public class ShoppingCart {
    private Map<String, Double> productPrices = new HashMap<>();
    private Map<String, Double> orderedItems = new LinkedHashMap<>();

    // Add product with price
    public void addProduct(String product, double price) {
        productPrices.put(product, price);
        orderedItems.put(product, price);
    }

    // Display products sorted by price
    public Map<String, Double> getSortedByPrice() {
        List<Map.Entry<String, Double>> sortedEntries = new ArrayList<>(productPrices.entrySet());

        // Sort by price (value)
        sortedEntries.sort(Map.Entry.comparingByValue());

        // Preserve order in LinkedHashMap
        Map<String, Double> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Double> entry : sortedEntries) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    // Display products in the order they were added
    public Map<String, Double> getOrderedItems() {
        return new LinkedHashMap<>(orderedItems);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding products
        cart.addProduct("Laptop", 800.00);
        cart.addProduct("Phone", 500.00);
        cart.addProduct("Headphones", 150.00);
        cart.addProduct("Mouse", 50.00);

        // Display products
        System.out.println("Product Prices (Unordered): " + cart.productPrices);
        System.out.println("Products in Order of Addition: " + cart.getOrderedItems());
        System.out.println("Products Sorted by Price: " + cart.getSortedByPrice());
    }
}
