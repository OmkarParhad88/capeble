public class shorting1 {
  public static void main(String[] args) {
    int count = 0;
    int arr[] = { 2, 5, 5, 5, 6, 6, 8, 9, 9, 9 };
    
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 5 && count == 0) {
        System.out.println("the first element occurr on index " + i);
      }

      if (arr[i] == 5) {
        count++;
      }
    }
    System.out.println("the last element on index " + count);
  }
}
