import java.util.Scanner;

public class S10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sorted array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the sorted array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the target value
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();

        // Perform binary search
        int result = binarySearch(array, target);
        
        // Output the result
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found");
        }

        scanner.close();
    }
    
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Check if target is present at mid
            if (array[mid] == target) {
                return mid;
            }
            
            // If target is greater, ignore left half
            if (array[mid] < target) {
                left = mid + 1;
            } 
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }
        
        // Target was not found
        return -1;
    }
}
