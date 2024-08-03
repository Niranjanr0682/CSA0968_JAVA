
public class S45 {

    public static void main(String[] args) {
      System.out.println("Test Case 1: Exception Occurs");
        divideNumbers(10, 0); 
        System.out.println();

        
        System.out.println("Test Case 2: No Exception");
        divideNumbers(10, 2);
    }

    // Method that performs division and demonstrates finally block
    private static void divideNumbers(int numerator, int denominator) {
        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
           
            System.out.println("Finally block executed");
        }
        System.out.println("Rest of the code");
    }
}
