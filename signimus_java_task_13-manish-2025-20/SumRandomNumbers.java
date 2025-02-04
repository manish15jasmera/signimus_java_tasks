import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SumRandomNumbers {
    public static void main(String[] args) {
        int sum = 0;
        try (Scanner scanner = new Scanner(new File("numbers.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                try {
                    int number = Integer.parseInt(line.trim());
                    sum += number;
                } catch (NumberFormatException e) {
                    System.out.println("Skipping invalid number: " + line);
                }
            }
            System.out.println("The sum of numbers is: " + sum);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}
