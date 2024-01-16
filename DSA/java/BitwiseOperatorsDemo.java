public class BitwiseOperatorsDemo {

    public static void main(String[] args) {
        // Bitwise AND (&) Operator
        bitwiseAndExample();

        // Bitwise OR (|) Operator
        bitwiseOrExample();

        // Bitwise XOR (^) Operator
        bitwiseXorExample();

        // Bitwise NOT (~) Operator
        bitwiseNotExample();

        // Left Shift (<<) Operator
        leftShiftExample();

        // Right Shift (>>) Operator
        rightShiftExample();

        // Unsigned Right Shift (>>>) Operator
        unsignedRightShiftExample();
    }

    private static void bitwiseAndExample() {
        int a = 5; // binary: 101
        int b = 3; // binary: 011

        int result = a & b;
        System.out.println("Bitwise AND: " + result);
        // Output: 1 (binary: 001)
    }

    private static void bitwiseOrExample() {
        int a = 5; // binary: 101
        int b = 3; // binary: 011

        int result = a | b;
        System.out.println("Bitwise OR: " + result);
        // Output: 7 (binary: 111)
    }

    private static void bitwiseXorExample() {
        int a = 5; // binary: 101
        int b = 3; // binary: 011

        int result = a ^ b;
        System.out.println("Bitwise XOR: " + result);
        // Output: 6 (binary: 110)
    }

    private static void bitwiseNotExample() {
        int a = 5; // binary: 101

        int result = ~a;
        System.out.println("Bitwise NOT: " + result);
        // Output: -6 (binary: 11111111111111111111111111111010 in two's complement)
    }

    private static void leftShiftExample() {
        int a = 5; // binary: 101

        int result = a << 1;
        System.out.println("Left Shift: " + result);
        // Output: 10 (binary: 1010)
    }

    private static void rightShiftExample() {
        int a = 5; // binary: 101

        int result = a >> 1;
        System.out.println("Right Shift: " + result);
        // Output: 2 (binary: 10)
    }

    private static void unsignedRightShiftExample() {
        int a = -5; // binary: 11111111111111111111111111111011 in two's complement

        int result = a >>> 1;
        System.out.println("Unsigned Right Shift: " + result);
    }
}
