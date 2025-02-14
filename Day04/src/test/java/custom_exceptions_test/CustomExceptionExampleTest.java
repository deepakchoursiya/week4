package custom_exceptions_test;

import custom_exceptions.CustomExceptionExample;

import custom_exceptions.InvalidAgeException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

 public class CustomExceptionExampleTest {
    @Test
    void testInvalidAge() {
        assertThrows(InvalidAgeException.class, () -> CustomExceptionExample.validateAge(16));
    }
}
