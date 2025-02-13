package bufferedstreams;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UnbufferedFileCopyTest {
    @Test
    public void testUnbufferedCopyCreatesFile() throws IOException {
        String sourcePath = "C:\\TextFiles\\src.txt";
        String destPath = "C:\\TextFiles\\dest.txt";

        UnbufferedFileCopy.copy(sourcePath, destPath);

        File destFile = new File(destPath);
        assertTrue(destFile.exists(), "Unbuffered copy should create the destination file.");
    }
}
