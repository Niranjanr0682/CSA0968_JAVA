import java.util.Scanner;

public class S07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        int missingNumber = findMissingNumber(array, size + 1);
        System.out.println("The missing number is: " + missingNumber);
        
        scanner.close();
    }
    
    public static int findMissingNumber(int[] array, int n) {
        int expectedSum = n * (n + 1) / 2;
        
        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }
        
        return expectedSum - actualSum;
    }
}
