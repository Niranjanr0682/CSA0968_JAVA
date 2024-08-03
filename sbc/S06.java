import java.util.Arrays;
import java.util.Scanner;

public class S06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Check if they are anagrams
        if (areAnagrams(str1, str2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }

        scanner.close();
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Remove whitespace and convert to lowercase for consistent comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths differ, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        // Sort both arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Check if sorted arrays are equal
        return Arrays.equals(array1, array2);
    }
}
