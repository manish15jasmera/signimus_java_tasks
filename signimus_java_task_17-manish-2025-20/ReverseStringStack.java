// Implement a stack to reverse a string. 

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringStack {
    public static String reverse(String str) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }
        
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
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
