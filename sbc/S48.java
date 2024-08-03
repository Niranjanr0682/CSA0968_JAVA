public class S48 {

    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8};
        findMinMax(array);
    }

    private static void findMinMax(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Array is empty or null.");
            return;
        }

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Largest element: " + max);
        System.out.println("Smallest element: " + min);
    }
}
