import java.util.Scanner;

public class Project_0 {
  public static void main(String[] args) {
    // Display welcome message
    System.out.println("Welcome to the Java Welcome Program!");

    // Arithmetic expression
    int x = 5;
    double y = 2.5;
    System.out.println("Result of x + y: " + (x + y));

    // Check for umbrella based on raining condition
    Scanner scanner = new Scanner(System.in);
    System.out.print("Is it raining? (Enter 'yes' or 'no'): ");
    String rainingInput = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitivity

    if (rainingInput.equals("yes")) {
      System.out.println("You should take an umbrella!");
    } else if (rainingInput.equals("no")) {
      System.out.println("No need for an umbrella.");
    } else {
      System.out.println("Invalid input. Please enter 'yes' or 'no'.");
    }

    // Check if 10 is greater than 5
    int num1 = 10;
    int num2 = 5;
    System.out.println("Is 10 greater than 5? " + (num1 > num2 ? "Yes" : "No"));

    // Close the scanner
    scanner.close();
  }

}
