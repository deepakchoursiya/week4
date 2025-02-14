package checked_exceptions;

import java.io.*;


public class CheckedExceptionExample {
    public static String readFile(String fileName) throws IOException {
        File file = new File(fileName);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            return br.readLine();
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println(readFile("data.txt"));
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
