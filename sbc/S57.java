import java.util.PriorityQueue;
import java.util.Scanner;

public class S57 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the value of K: ");
        int k = scanner.nextInt();

        if (k > 0 && k <= n) {
            int kthLargest = findKthLargest(array, k);
            System.out.println("The " + k + "th largest element is: " + kthLargest);
        } else {
            System.out.println("Invalid value of K. It must be between 1 and " + n + ".");
        }

        scanner.close();
    }
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}
