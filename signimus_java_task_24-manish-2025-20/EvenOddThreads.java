// Create a Java program where two threads run simultaneously, one printing even numbers and the other printing odd numbers.

class EvenThread extends Thread {
  private int limit;

  public EvenThread(int limit) {
      this.limit = limit;
  }

  @Override
  public void run() {
      for (int i = 2; i <= limit; i += 2) {
          System.out.println("Even: " + i);
          try {
              Thread.sleep(500);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
  }
}

class OddThread extends Thread {
  private int limit;

  public OddThread(int limit) {
      this.limit = limit;
  }

  @Override
  public void run() {
      for (int i = 1; i <= limit; i += 2) {
          System.out.println("Odd: " + i);
          try {
              Thread.sleep(500);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
  }
}

public class EvenOddThreads {
  public static void main(String[] args) {
      int limit = 10;

      EvenThread evenThread = new EvenThread(limit);
      OddThread oddThread = new OddThread(limit);

      evenThread.start();
      oddThread.start();
  }
}
