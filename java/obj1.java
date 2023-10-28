package java;

// Abstraction
abstract class Shape {
  abstract double area(); // Abstract method
}

// Inheritance
class Circle extends Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  double area() {
    return Math.PI * radius * radius;
  }
}

// Inheritance
class Rectangle extends Shape {
  private double width;
  private double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  @Override
  double area() {
    return width * height;
  }
}

// Encapsulation
class EncapsulationDemo {
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age >= 0) {
      this.age = age;
    } else {
      System.out.println("Age cannot be negative.");
    }
  }
}

public class obj1 {
  public static void main(String[] args) {
    // Abstraction
    Shape circle = new Circle(5);
    Shape rectangle = new Rectangle(4, 6);

    System.out.println("Circle Area: " + circle.area());
    System.out.println("Rectangle Area: " + rectangle.area());

    // Encapsulation
    EncapsulationDemo person = new EncapsulationDemo();
    person.setName("John");
    person.setAge(30);

    System.out.println("Name: " + person.getName());
    System.out.println("Age: " + person.getAge());
  }
}
