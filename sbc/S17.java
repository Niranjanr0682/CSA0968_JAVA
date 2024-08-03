import java.util.Scanner;

public class S17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int vowelCount = 0;
        int consonantCount = 0;
        input = input.toLowerCase();
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;}}}
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
        scanner.close();}}
