import java.util.Scanner;

public class S39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();
            int[] array = new int[n];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.print("Enter the index position: ");
            int index = scanner.nextInt();

            System.out.print("Enter the number to divide the element by: ");
            int divisor = scanner.nextInt();

            int element = array[index];
            int result = element / divisor;

            System.out.println("The result of the division is: " + result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: The index is out of the array bounds.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Throwable e) { 
            System.out.println("Error: An unexpected error occurred. " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
