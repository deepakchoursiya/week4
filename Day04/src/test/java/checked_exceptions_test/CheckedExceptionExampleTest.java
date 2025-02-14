package checked_exceptions_test;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import checked_exceptions.CheckedExceptionExample;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CheckedExceptionExampleTest {
    @Test
    void testFileNotFound() {
        assertThrows(IOException.class, () -> CheckedExceptionExample.readFile("nonexistent.txt"));
    }
}
