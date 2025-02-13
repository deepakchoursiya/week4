package bufferedstreams;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PerformanceComparisonTest {
    @Test
    public void testBufferedFasterThanUnbuffered() throws IOException {
        String sourcePath = "C:\\TextFiles\\src.txt";
        String bufferedDestPath = "C:\\TextFiles\\dest.txt";
        String unbufferedDestPath = "C:\\TextFiles\\dest.txt";

        long bufferedTime = PerformanceComparison.copyWithBufferedStream(sourcePath, bufferedDestPath);
        long unbufferedTime = PerformanceComparison.copyWithUnbufferedStream(sourcePath, unbufferedDestPath);

        assertTrue(bufferedTime < unbufferedTime, "Buffered copy should be faster than unbuffered copy.");
    }
}
