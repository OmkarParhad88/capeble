public class sarching2 {
  public static void main(String[] args) {
    int[] arr = { 0, 1, 2, 3, 6, 9, 11, 15 };
    int smallestMissing = findSmallestMissingElement(arr);
    System.out.println("The smallest missing element is: " + smallestMissing);
  }

  static int findSmallestMissingElement(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      if (arr[i] != i) {
        return i;
      }
    }
    return n;
  }
}
