// create lambda expression using Runnable interface.

public class LambdaRunnableExample {
  public static void main(String[] args) {
      Runnable task = () -> System.out.println("Running in a separate thread using Lambda!");
      Thread thread = new Thread(task);
      thread.start();
  }
}
