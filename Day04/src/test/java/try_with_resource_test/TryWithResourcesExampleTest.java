package try_with_resource_test;

import org.junit.jupiter.api.Test;
import try_with_resource.TryWithResourcesExample;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class TryWithResourcesExampleTest {
    @Test
    void testFileNotFound() {
        assertThrows(IOException.class, () -> TryWithResourcesExample.readFirstLine("nonexistent.txt"));
    }
}
