import java.util.Scanner;

public class cj18 {
  public static void generateSubsequences(String s, int index, String current) {
    if (index == s.length()) {
      System.out.println(current);
      return;
    }

    // Recursive case 1: Include the current character in the subsequence
    generateSubsequences(s, index + 1, current + s.charAt(index));

    // Recursive case 2: Exclude the current character from the subsequence
    generateSubsequences(s, index + 1, current);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Input
    String s = scanner.next();
    // Generate and print all subsequences
    generateSubsequences(s, 0, "");
    scanner.close();
  }
}