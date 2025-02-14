package finally_block_execution_test;

import finally_block_execution.FinallyExample;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FinallyExampleTest {
    @Test
    void testValidDivision() {
        assertEquals(5, FinallyExample.divideNumbers(10, 2));
    }

    @Test
    void testDivisionByZero() {
        assertEquals(-1, FinallyExample.divideNumbers(10, 0));
    }
}
