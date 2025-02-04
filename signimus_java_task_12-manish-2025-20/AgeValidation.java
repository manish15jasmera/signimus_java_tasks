import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class AgeInvalidException extends Exception {
  public AgeInvalidException(String message) {
      super(message);
  }
}


class AgeValidator {
  public static void validateAge(int age) throws AgeInvalidException {
      if(age < 0) {
          throw new AgeInvalidException("Invalid age: " + age);
      }
  }
}


public class AgeValidation {
    public static String readFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        StringBuilder content = new StringBuilder();
        String line;
        while((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }
        reader.close();
        return content.toString();
    }
public static void main(String[] args) {
        try {
            AgeValidator.validateAge(-1);
        } catch (AgeInvalidException e) {
            System.out.println("Error: " + e.getMessage());
        }
try {
            System.out.println(readFile("example.txt"));
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
