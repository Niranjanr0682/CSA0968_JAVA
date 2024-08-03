// Custom exception class
class CustomException extends Exception {
    // Constructor that accepts a message and a cause
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class S44 {

    public static void main(String[] args) {
        // Test Case: Demonstrating exception chaining
        String input = "invalid";
        
        try {
            processInput(input);
        } catch (CustomException e) {
            // Catch the custom exception and print details
            System.out.println("Caught: " + e.getMessage());
            System.out.println("Original cause: " + e.getCause());
        }
    }

    // Method that simulates processing of input and may throw a custom exception
    private static void processInput(String input) throws CustomException {
        try {
            int number = Integer.parseInt(input); // This will throw NumberFormatException for invalid input
        } catch (NumberFormatException e) {
            // Wrap NumberFormatException in CustomException and throw it
            throw new CustomException("Invalid input encountered in method1", e);
        }
    }
}
