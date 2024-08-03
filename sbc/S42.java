public class S42 {

    public static void main(String[] args) {
        // Test Case 1: No Exception
        System.out.println("Test Case 1: No Exception");
        testCaseNoException();
        System.out.println();

        // Test Case 2: ArithmeticException
        System.out.println("Test Case 2: Arithmetic Exception");
        testCaseArithmeticException();
        System.out.println();

        // Test Case 3: ArrayIndexOutOfBoundsException
        System.out.println("Test Case 3: Array Index Out of Bounds");
        testCaseArrayIndexOutOfBounds();
    }

    // Method for Test Case 1: No Exception
    private static void testCaseNoException() {
        int[] numbers = {10, 20, 2, 40};
        int index = 2;
        int divisor = 2;

        try {
            try {
                int result = numbers[index] / divisor;
                System.out.println("Result: " + result);
            } catch (ArithmeticException ae) {
                System.out.println("Inner catch: ArithmeticException caught");
            } catch (ArrayIndexOutOfBoundsException aioobe) {
                System.out.println("Inner catch: ArrayIndexOutOfBoundsException caught");
            }
        } catch (Exception e) {
            System.out.println("Outer catch: General Exception caught");
        }

        System.out.println("Execution continues...");
    }

    // Method for Test Case 2: ArithmeticException
    private static void testCaseArithmeticException() {
        int[] numbers = {10, 20, 0, 40};
        int index = 0;
        int divisor = numbers[2]; // This will cause ArithmeticException

        try {
            try {
                int result = numbers[index] / divisor;
                System.out.println("Result: " + result);
            } catch (ArithmeticException ae) {
                System.out.println("Inner catch: ArithmeticException caught");
            } catch (ArrayIndexOutOfBoundsException aioobe) {
                System.out.println("Inner catch: ArrayIndexOutOfBoundsException caught");
            }
        } catch (Exception e) {
            System.out.println("Outer catch: General Exception caught");
        }

        System.out.println("Execution continues...");
    }

    // Method for Test Case 3: ArrayIndexOutOfBoundsException
    private static void testCaseArrayIndexOutOfBounds() {
        int[] numbers = {10, 20, 30};
        int index = 5; // This will cause ArrayIndexOutOfBoundsException
        int divisor = 2;

        try {
            try {
                int result = numbers[index] / divisor;
                System.out.println("Result: " + result);
            } catch (ArithmeticException ae) {
                System.out.println("Inner catch: ArithmeticException caught");
            } catch (ArrayIndexOutOfBoundsException aioobe) {
                System.out.println("Inner catch: ArrayIndexOutOfBoundsException caught");
            }
        } catch (Exception e) {
            System.out.println("Outer catch: ArrayIndexOutOfBoundsException caught");
        }

        System.out.println("Execution continues...");
    }
}
