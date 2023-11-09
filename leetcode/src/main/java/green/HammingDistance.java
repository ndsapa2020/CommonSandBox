package green;

public class HammingDistance {
//    The Hamming distance between two integers is the number of positions
//    at which the corresponding bits are different.
//    Given two integers x and y, return the Hamming distance between them.

    public static int hammingDistance(int x, int y) {
        int temp = x^y;
        System.out.println(temp + " -> binary = " + Integer.toBinaryString(temp) + " -> " + Integer.bitCount(temp));

        StringBuilder s1 = new StringBuilder(Integer.toBinaryString(x));
        StringBuilder s2 = new StringBuilder(Integer.toBinaryString(y));
        int l1 = s1.length();
        int l2 = s2.length();
        if (l2 > l1) {
            for (int i = 0; i < l2 - l1; i++) {
                s1.insert(0, "0");
            }
        } else {
            for (int i = 0; i < l1 - l2; i++) {
                s2.insert(0, "0");
            }
        }
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int result = hammingDistance(1, 4);
        System.out.println("Result = " + result);
    }

}
