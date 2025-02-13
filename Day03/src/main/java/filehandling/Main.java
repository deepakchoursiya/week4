package filehandling;

public class Main {
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();

        String sourceFilePath ="C:\\TextFiles\\src.txt";
        String destinationFilePath =  "C:\\TextFiles\\dest.txt";
        fileHandler.copyFile(sourceFilePath, destinationFilePath);
    }
}
