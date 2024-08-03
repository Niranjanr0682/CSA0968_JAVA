public class S46{

    public static void main(String[] args) {
        try {
            method1();
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
    }

    private static void method1() throws ArithmeticException {
        try {
            int result = 10 / 0; // This will cause ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in method1: " + e.getMessage());
            throw e; // Rethrow the exception
        }
    }
}
