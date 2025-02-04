import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class LineCounter {
    public static void main(String[] args) {
        String fileName = "example.txt"; 
        int lineCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while (br.readLine() != null) {
                lineCount++;
            }
            System.out.println("Total number of lines: " + lineCount);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
