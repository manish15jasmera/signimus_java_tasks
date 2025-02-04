import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerResourceHandling {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("example.txt"));
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } finally {
            if (scanner != null) {
                scanner.close();
                System.out.println("Scanner closed successfully.");
            }
        }
    }
}
