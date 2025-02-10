// Write a recursive program to reverse a string.

import java.util.Scanner;

public class ReverseStringRecursion {
    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String reversed = reverse(input);
        System.out.println("Reversed string: " + reversed);
        
        scanner.close();
    }
}
