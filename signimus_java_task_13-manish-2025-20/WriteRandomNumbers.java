import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class WriteRandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        try (FileWriter writer = new FileWriter("numbers.txt")) {
            for (int i = 0; i < 10; i++) {
                writer.write(random.nextInt(100) + "\n");
            }
            System.out.println("Random numbers written to numbers.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
