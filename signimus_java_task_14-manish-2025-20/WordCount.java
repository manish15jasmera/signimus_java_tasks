import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount{
    public static int countWordsInFile(String filePath) {
        int wordCount = 0;
        boolean inWord = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int c; 
            while ((c = reader.read()) != -1) {
                if (Character.isWhitespace(c)) {
                    if (inWord) {
                        wordCount++; 
                        inWord = false;
                    }
                } else {
                    inWord = true;
                }
            }
            
            if (inWord) {
                wordCount++;
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return wordCount;
    }

    public static void main(String[] args) {
        String filePath = "test.txt"; 

        int totalWords = countWordsInFile(filePath);
        System.out.println("Total number of words in the file: " + totalWords);
    }
}
