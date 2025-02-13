package datastreams;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String FILE_PATH = "C:\\TextFiles\\studentData.Dat";

    public static void main(String[] args) {
        Student student1 = new Student(101, "Deepak", 8.5);
        Student student2 = new Student(102, "Rohit", 9.2);
        List<Student> ss =new ArrayList<>();
        ss.add(student1);
        ss.add(student2);

        try {
            StudentDataHandler.writeStudentsToFile(FILE_PATH, ss);
            System.out.println("Students written to file successfully!");

            List<Student> students = StudentDataHandler.readStudentsFromFile(FILE_PATH);
            System.out.println("Retrieved Students:");
            for (Student student : students) {
                System.out.println(student);
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
