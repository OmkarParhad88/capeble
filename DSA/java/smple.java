import java.util.Scanner;

public class Main {

    static int setBitAtPosition(int n, int pos) {
     // Write your code here
        int bitmask = n<<2;
        int set = n | bitmask;
        String bit = Interger     
        return set;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int pos = scanner.nextInt();
        int result = setBitAtPosition(n, pos);
        System.out.println(result);
        scanner.close();
    }
}