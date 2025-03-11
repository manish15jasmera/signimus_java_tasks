// Create an interface with a default method and override it in a class.

interface Greetable {
  default void greet() {
      System.out.println("Hello from the default method!");
  }
}

class CustomGreeting implements Greetable {
  @Override
  public void greet() {
      System.out.println("Hello from the overridden method!");
  }
}

public class GreetingDemo {
  public static void main(String[] args) {
      Greetable defaultGreeting = new Greetable() {};
      defaultGreeting.greet();

      Greetable customGreeting = new CustomGreeting();
      customGreeting.greet();
  }
}
