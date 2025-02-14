package throw_throws_test;

import org.junit.jupiter.api.Test;
import throw_throws.InterestCalculator;

import static org.junit.jupiter.api.Assertions.*;

class InterestCalculatorTest {
    @Test
    void testValidInterestCalculation() {
        assertEquals(100, InterestCalculator.calculateInterest(1000, 5, 2));
    }

    @Test
    void testInvalidInterestCalculation() {
        assertThrows(IllegalArgumentException.class, () -> InterestCalculator.calculateInterest(-1000, 5, 2));
    }
}
