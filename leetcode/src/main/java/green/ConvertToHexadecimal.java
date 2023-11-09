package green;

public class ConvertToHexadecimal {
    public static String toHex(int num) {
        String[] digits = "0123456789abcdef".split("");
        if (num == 0) {
            return "0";
        }
        if(num == Integer.MIN_VALUE){
            return "80000000";
        }
        long val = (num < 0) ? Integer.MAX_VALUE + num + 1 : num;
        String hex = "";
        while (val > 0){
            int d = (int) val % 16;
            hex = digits[d] + hex;
            val /= 16;
        }
        if (num < 0 && hex.length() > 0) {
            hex = "f" + hex.substring(1);
        }
        return hex;
    }

    public static void main(String[] args) {
        int num = -2147483648;
        num = -1;
        System.out.println(Integer.MIN_VALUE + " MAX = " + Integer.MAX_VALUE);
        System.out.println("\nExpected: " + Integer.toHexString(num) + " / my method: " +toHex(num));
    }
}
