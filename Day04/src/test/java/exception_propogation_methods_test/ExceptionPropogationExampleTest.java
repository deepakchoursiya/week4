package exception_propogation_methods_test;

import exception_propogation_methods.ExceptionPropagationExample;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExceptionPropagationExampleTest {
    @Test
    void testExceptionPropagation() {
        Exception exception = assertThrows(ArithmeticException.class, () -> ExceptionPropagationExample.method1());
        assertEquals("Division by zero!", exception.getMessage());
    }
}
