import java.util.Scanner;

public class smple {

  static int calculateNthTerm(int a, int r, int n) {

    // Using the formula: a * r^(n-1)
    // System.out.println(Math.round(Math.pow(r, n - 1)));
    return Math.round(a * (Math.round(Math.pow(r, n - 1))));
    // return 1;
  }

  public static void main(String[] args) {
    int result = calculateNthTerm(2, 3, 4);
    System.out.println(result);
  }
}