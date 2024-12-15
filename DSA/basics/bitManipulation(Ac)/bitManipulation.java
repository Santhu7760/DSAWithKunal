public class bitManipulation {

    public static void bitwiseAndOr() {
        int a = 10;
        int b = 20;
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println((a | b) + (a & b));
        System.out.println((a ^ a) + (a & a));
    }

    public static void exOr() {
        int a = 20;
        int b = 25;
        int c = a ^ b;
        System.out.println(c);
    }

    public static void onesComplement() {
        int a = 39;
        int b = ~(a);
        System.out.println("One's complement (binary): " + Integer.toBinaryString(b));
        System.out.println(b);
    }

    public static void leftAndRightShift() {
        int num = 10;
        int ans = num >> 4;
        int ans1 = num << 4;
        System.out.println(ans);
        System.out.println(ans1);
    }

    public static int getBit(int n, int position) {
        int bitmask = 1 << position;
        int ans = n & bitmask;

        return ans > 1 ? 1 : 0;
    }

    public static void setBit(int n, int position) {
        int bitmask = 1 << position;
        System.out.println(n | bitmask);
    }

    public static void clearBit(int n, int position) {
        int bitmask = 1 << position;
        int notBitmask = ~(bitmask);
        System.out.println(notBitmask & n);
    }

    public static void updateBit(int n, int position, int option) {
        int bitmask = 1 << position;
        int notBitmask = ~(bitmask);

        if (option < 0 || option > 1) {
            System.out.println("Option must be 0 or 1");
        } else if (option == 1) {
            System.out.println(notBitmask & n);
        } else {
            System.out.println(bitmask | n);
        }
    }

    public static void updateBitII(int n, int position) {
        int bitmask = 1 << position;
        int notBitmask = ~(bitmask);

        int result = getBit(n, position);

        if (result == 1) {
            System.out.println(notBitmask & n);
        } else {
            System.out.println(bitmask | n);
        }
    }


    public static void main(String[] args) {
        System.out.println(getBit(8, 3));
        // setBit(5, 3);
        // clearBit(5, 0);
        // updateBit(5, 2, 1);
        // updateBitII(5, 1);
        // bitwiseAndOr();
        // onesComplement();
        // leftAndRightShift();
    }
}