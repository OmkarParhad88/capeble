
public class smple {

    public static int findSingleElement(int[] nums) {
        int ones = 0; // To store bits that appear once
        int twos = 0; // To store bits that appear twice

        for (int num : nums) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }

        return ones;
    }
    public static void main(String[] args) {
        int[] array = { 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6 };
        int result = findSingleElement(array);
        System.out.println(result);
    }
}