package green;

public class NumberComplement {
    public static int findComplement(int num) {
        String bi = Integer.toBinaryString(num);
        char[] arr = bi.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bi.length(); i++) {
            char c = bi.charAt(i) == '1' ? '0' : '1';
            sb.append(c);
        }
        return Integer.parseInt(sb.toString(), 2);
    }

    public static void main(String[] args) {
        System.out.println(findComplement(5));
        System.out.println(findComplement(1));
        System.out.println(findComplement(Integer.MAX_VALUE ));
    }
}
