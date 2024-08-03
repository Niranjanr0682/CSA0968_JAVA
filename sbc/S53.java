import java.util.Scanner;

public class S53 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the first array: ");
        int m = scanner.nextInt();
        int[] array1 = new int[m];

        System.out.println("Enter the elements of the first sorted array:");
        for (int i = 0; i < m; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of elements in the second array: ");
        int n = scanner.nextInt();
        int[] array2 = new int[n];

        System.out.println("Enter the elements of the second sorted array:");
        for (int i = 0; i < n; i++) {
            array2[i] = scanner.nextInt();
        }

        int[] mergedArray = mergeArrays(array1, array2);

    
        System.out.println("Merged sorted array:");
        for (int i : mergedArray) {
            System.out.print(i + " ");
        }

        scanner.close();
    }


    public static int[] mergeArrays(int[] array1, int[] array2) {
        int m = array1.length;
        int n = array2.length;
        int[] mergedArray = new int[m + n];

        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (array1[i] <= array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

    
        while (i < m) {
            mergedArray[k++] = array1[i++];
        }
        while (j < n) {
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;
    }
}
