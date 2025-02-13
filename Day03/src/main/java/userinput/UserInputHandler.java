package userinput;

import java.io.IOException;

public class UserInputHandler {
    private static final String FILE_PATH = "C:\\TextFiles\\src.txt";

    public static void handleUserInput() throws IOException {
        String[] userData = UserInputReader.readUserInput();
        UserInputWriter.writeToFile(FILE_PATH, userData);
        System.out.println("User data saved successfully to: " + FILE_PATH);
    }
}
