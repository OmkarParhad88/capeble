public class recursion {

  public static int factorial(int x) {
    if (x == 0) {
      return 1;
    } else {
      x = x * factorial(x - 1);
      return x;
    }
  }

  public static int fibo(int x) {
    if (x <= 2) {
      return 1;
    } else {
      return fibo(x - 2) + fibo(x - 1);
    }
  }

  public static void main(String[] args) {
    int a = factor(10);
    System.out.println(a);
    int b = fibo(6);
    System.out.println(b);
  }
}
