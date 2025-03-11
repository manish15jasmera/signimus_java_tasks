// Use Java 8 Date API to get the current date and time and format it in "dd-MM-yyyy" format.

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormattingExample {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String formattedDate = currentDate.format(formatter);
        String formattedDateTime = currentDateTime.format(formatter);

        System.out.println("Formatted Current Date: " + formattedDate);
        System.out.println("Formatted Current DateTime: " + formattedDateTime);
    }
}
