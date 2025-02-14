package unchecked_exceptions_test;

import org.junit.jupiter.api.Test;
import unchecked_exceptions.UncheckedExceptionExample;

import static org.junit.jupiter.api.Assertions.*;

class UncheckedExceptionExampleTest {
    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> UncheckedExceptionExample.divide(10, 0));
    }
}
