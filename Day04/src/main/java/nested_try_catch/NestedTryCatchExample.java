package nested_try_catch;

public class NestedTryCatchExample {
    public static int safeDivide(int[] arr, int index, int divisor) {
        try {
            int value = arr[index]; // May throw ArrayIndexOutOfBoundsException
            try {
                return value / divisor; // May throw ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
                return 0;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        // Test valid input
        System.out.println(safeDivide(numbers, 1, 2)); // Expected: 10

        // Test invalid index
        System.out.println(safeDivide(numbers, 5, 2)); // Expected: "Invalid array index!"

        // Test division by zero
        System.out.println(safeDivide(numbers, 1, 0)); // Expected: "Cannot divide by zero!"
    }
}
