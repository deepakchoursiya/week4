package nested_try_catch_test;

import nested_try_catch.NestedTryCatchExample;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NestedTryCatchExampleTest {
    @Test
    void testValidDivision() {
        int[] arr = {10, 20, 30};
        assertEquals(10, NestedTryCatchExample.safeDivide(arr, 1, 2));
    }

    @Test
    void testInvalidIndex() {
        int[] arr = {10, 20, 30};
        assertEquals(-1, NestedTryCatchExample.safeDivide(arr, 5, 2));
    }

    @Test
    void testDivisionByZero() {
        int[] arr = {10, 20, 30};
        assertEquals(0, NestedTryCatchExample.safeDivide(arr, 1, 0));
    }
}
