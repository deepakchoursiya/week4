package shopping_cart_test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shopping_cart.ShoppingCart;

import java.util.Map;

class ShoppingCartTest {
    private ShoppingCart cart;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();
        cart.addProduct("Laptop", 800.00);
        cart.addProduct("Phone", 500.00);
        cart.addProduct("Headphones", 150.00);
        cart.addProduct("Mouse", 50.00);
    }

    @Test
    void testOrderedItems() {
        String[] expectedOrder = {"Laptop", "Phone", "Headphones", "Mouse"};
        assertArrayEquals(expectedOrder, cart.getOrderedItems().keySet().toArray());
    }

    @Test
    void testSortedByPrice() {
        String[] expectedOrder = {"Mouse", "Headphones", "Phone", "Laptop"};
        assertArrayEquals(expectedOrder, cart.getSortedByPrice().keySet().toArray());
    }

    @Test
    void testProductPrices() {
        assertEquals(800.00, cart.getOrderedItems().get("Laptop"));
        assertEquals(500.00, cart.getOrderedItems().get("Phone"));
        assertEquals(150.00, cart.getOrderedItems().get("Headphones"));
        assertEquals(50.00, cart.getOrderedItems().get("Mouse"));
    }
}
