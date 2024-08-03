import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadWithTryWithResources {

    public static void main(String[] args) {
        String filePath = "example.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle the IOException (e.g., file not found, read error)
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
        
        System.out.println("File reading completed.");
    }
}
