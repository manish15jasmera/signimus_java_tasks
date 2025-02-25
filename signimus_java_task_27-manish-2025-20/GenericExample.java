//Create a generic class Pair<T, U> that can hold two different types of values. Implement methods to set and get these values.
//Write a generic method swap() that takes two elements of the same type and swaps their values.
//Create a generic method that finds the maximum of three numbers, where the numbers can be

class Pair<T, U> {
  private T first;
  private U second;

  public Pair(T first, U second) {
      this.first = first;
      this.second = second;
  }

  public T getFirst() {
      return first;
  }

  public void setFirst(T first) {
      this.first = first;
  }

  public U getSecond() {
      return second;
  }

  public void setSecond(U second) {
      this.second = second;
  }

  @Override
  public String toString() {
      return "Pair{" + "first=" + first + ", second=" + second + '}';
  }
}

class SwapUtil {
  public static <T> void swap(Pair<T, T> pair) {
      T temp = pair.getFirst();
      pair.setFirst(pair.getSecond());
      pair.setSecond(temp);
  }
}

class GenericUtil {
  public static <T extends Comparable<T>> T maxOfThree(T a, T b, T c) {
      T max = a.compareTo(b) > 0 ? a : b;
      return max.compareTo(c) > 0 ? max : c;
  }
}

public class GenericExample {
  public static void main(String[] args) {
      Pair<Integer, String> pair = new Pair<>(10, "Ten");
      System.out.println("Pair: " + pair);

      Pair<Integer, Integer> intPair = new Pair<>(10, 20);
      System.out.println("Before swap: " + intPair);
      SwapUtil.swap(intPair);
      System.out.println("After swap: " + intPair);

      System.out.println("Max of 3, 7, 5: " + GenericUtil.maxOfThree(3, 7, 5));
      System.out.println("Max of 4.5, 2.2, 8.8: " + GenericUtil.maxOfThree(4.5, 2.2, 8.8));
      System.out.println("Max of 'apple', 'orange', 'banana': " + GenericUtil.maxOfThree("apple", "orange", "banana"));
  }
}
