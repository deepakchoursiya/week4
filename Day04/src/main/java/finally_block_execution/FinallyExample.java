package finally_block_execution;

import java.util.Scanner;

public class FinallyExample {
    public static int divideNumbers(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
            return -1;
        } finally {
            System.out.println("Operation completed");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int num = scanner.nextInt();
        System.out.print("Enter denominator: ");
        int den = scanner.nextInt();

        int result = divideNumbers(num, den);
        if (result != -1) {
            System.out.println("Result: " + result);
        }
        scanner.close();
    }
}
