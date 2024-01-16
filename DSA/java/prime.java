
class prime {
  public static void main(String[] args) {
    int num = 7;
    int i = 2;
    while (i < num) {
      if (num % i == 0) {
        System.out.println("number is not prime");
        return;
      }
      i++;
    }
    if (i == num) {
      System.out.println("number is prime");
    }

  }
}