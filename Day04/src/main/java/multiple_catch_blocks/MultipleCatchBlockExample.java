package multiple_catch_blocks;

public class MultipleCatchBlockExample {
    public static int getValueAtIndex(int[] arr, int index) {
        return arr[index];
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        try {
            System.out.println(getValueAtIndex(arr, 5));
            int a=arr[0]/0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }

    }
}
