package multiple_catch_block_test;

import multiple_catch_blocks.MultipleCatchBlockExample;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MultipleCatchExampleTest {
    @Test
    void testInvalidIndex() {
        int[] arr = {10, 20, 30};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> MultipleCatchBlockExample.getValueAtIndex(arr, 5));
    }
}
