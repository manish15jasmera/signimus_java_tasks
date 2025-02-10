// Find the factorial of a number using recursion.

import java.util.Scanner;

public class FactorialRecursion {
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = factorial(num);
            System.out.println("Factorial of " + num + " is: " + result);
        }

        scanner.close();
    }
}
