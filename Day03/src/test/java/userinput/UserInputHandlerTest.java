package userinput;

import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserInputHandlerTest {
    @Test
    public void testHandleUserInputCreatesFile() throws Exception {
        UserInputHandler.handleUserInput();
        File testFile = new File("C:\\TextFiles\\src.txt");
        assertTrue(testFile.exists(), "User data file should be created after handling input.");
    }
}
