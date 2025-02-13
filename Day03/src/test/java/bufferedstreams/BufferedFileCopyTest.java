package bufferedstreams;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BufferedFileCopyTest {
    @Test
    public void testBufferedCopyCreatesFile() throws IOException {
        String sourcePath = "C:\\TextFiles\\src.txt";
        String destPath = "C:\\TextFiles\\dest.txt";

        BufferedFileCopy.copy(sourcePath, destPath);

        File destFile = new File(destPath);
        assertTrue(destFile.exists(), "Buffered copy should create the destination file.");
    }
}
