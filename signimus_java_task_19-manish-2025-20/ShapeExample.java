// Create an interface Shape with an abstract method calculateArea().
// Create an abstract class Rectangle that implements Shape.
// It should have two protected instance variables: width and height.
// It should have a constructor that takes width and height as arguments.
// Create an anonymous class that extends Rectangle and provides the implementation for the calculateArea() method.
// Create a nested static class Circle within the Rectangle class that implements Shape.
// It should have a private instance variable radius.
// It should have a constructor that takes radius as an argument.
// It should provide the implementation for the calculateArea() method.
// Create a main class to:
// Create an instance of the anonymous Rectangle class.
// Create an instance of the Rectangle.Circle class.
// Print the areas of both shapes.

interface Shape {
  double calculateArea(); // Abstract method
}

abstract class Rectangle implements Shape {
  protected double width, height;

  public Rectangle(double width, double height) {
      this.width = width;
      this.height = height;
  }

  public static class Circle implements Shape {
      private double radius;

      public Circle(double radius) {
          this.radius = radius;
      }

      @Override
      public double calculateArea() {
          return Math.PI * radius * radius;
      }
  }
}

public class ShapeExample {
  public static void main(String[] args) {
      Rectangle rectangle = new Rectangle(5, 10) {
          @Override
          public double calculateArea() {
              return width * height;
          }
      };

      Rectangle.Circle circle = new Rectangle.Circle(7);

      System.out.println("Rectangle Area: " + rectangle.calculateArea());
      System.out.println("Circle Area: " + circle.calculateArea());
  }
}
