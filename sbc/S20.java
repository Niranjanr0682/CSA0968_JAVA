import java.util.Scanner;

public class S20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String processedString = input.replaceAll("\\s+", "").toLowerCase();
        boolean isPalindrome = true;
        int length = processedString.length();
        for (int i = 0; i < length / 2; i++) {
            if (processedString.charAt(i) != processedString.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;}}
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
        scanner.close();}}
