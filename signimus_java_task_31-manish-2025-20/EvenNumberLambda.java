// Check for Even Numbers with Lambda Expression.

public class EvenNumberLambda {
  public static void main(String[] args) {
      CheckEven checkEven = (num) -> num % 2 == 0;

      System.out.println(checkEven.isEven(10)); // true
      System.out.println(checkEven.isEven(15)); // false
  }

  interface CheckEven {
      boolean isEven(int num);
  }
}
