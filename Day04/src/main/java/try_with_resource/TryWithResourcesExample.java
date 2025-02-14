package try_with_resource;

import java.io.*;

public class TryWithResourcesExample {
    public static String readFirstLine(String fileName) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            return br.readLine();
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println(readFirstLine("info.txt"));
        } catch (IOException e) {
            System.out.println("Error reading file");

        }
    }
}
