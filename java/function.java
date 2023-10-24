
class function {
   static boolean isOdd(int a) {
    if (2 % a == 0) {
      return true;
    } else {
      return false;
    } 
  }
  public static void main(String[] args) {
    System.out.println(isOdd(3));
  }
}
