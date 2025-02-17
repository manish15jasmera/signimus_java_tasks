// Implement a method that calculates the average of an arbitrary number of double values using varargs.

public class AverageUsingVarArgs {
  public static double calculateAverage(double... numbers) {
      if (numbers.length == 0) {
          throw new IllegalArgumentException("At least one number is required.");
      }
      double sum = 0;
      for (double num : numbers) {
          sum += num;
      }
      return sum / numbers.length;
  }

  public static void main(String[] args) {
      System.out.println("Average: " + calculateAverage(10.5, 20.0, 30.5, 40.0)); 
  }
}
