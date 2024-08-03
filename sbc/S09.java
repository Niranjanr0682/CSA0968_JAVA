import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class S09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Calculate and print character frequencies
        printCharacterFrequency(input);
        
        scanner.close();
    }
    
    public static void printCharacterFrequency(String str) {
        // Create a HashMap to store the frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
            // If the character is already in the map, increment its count
            if (frequencyMap.containsKey(c)) {
                frequencyMap.put(c, frequencyMap.get(c) + 1);
            } else {
                // Otherwise, add the character to the map with a count of 1
                frequencyMap.put(c, 1);
            }
        }
        
        // Print the frequency of each character
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
