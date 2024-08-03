import java.util.Arrays;
import java.util.Scanner;

public class S04 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the array elements
        System.out.print("Enter the array elements (separated by spaces): ");
        String input = scanner.nextLine();
        String[] elements = input.split(" ");
        
        // Convert to integer array
        int[] array = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            array[i] = Integer.parseInt(elements[i]);
        }
        
        // Input M and N
        System.out.print("Enter the value of M (for Mth maximum): ");
        int M = scanner.nextInt();
        System.out.print("Enter the value of N (for Nth minimum): ");
        int N = scanner.nextInt();
        
        // Validate M and N
        if (M <= 0 || N <= 0 || M > array.length || N > array.length) {
            System.out.println("Invalid input for M or N");
            return;
        }
        
        // Sort the array
        Arrays.sort(array);
        
        // Mth maximum and Nth minimum
        int MthMax = array[array.length - M];
        int NthMin = array[N - 1];
        
        // Calculate sum and difference
        int sum = MthMax + NthMin;
        int difference = MthMax - NthMin;
        
        // Display the results
        System.out.println("Mth maximum number: " + MthMax);
        System.out.println("Nth minimum number: " + NthMin);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        
        scanner.close();
    }
}
