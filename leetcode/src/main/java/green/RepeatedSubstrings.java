package green;

public class RepeatedSubstrings {
    public static boolean repeatedSubstringPattern(String s) {
        int l = s.length();
        char beginChar = s.charAt(0);
        int p1 = 1;
        while (p1 < l) {
            while (p1 < l && s.charAt(p1) != beginChar) {
                p1++;
            }
            String substr = s.substring(0, p1);
            int currLn = substr.length();

            int begin = p1;
            int end = begin + currLn;
            if (end > l || (currLn > l / 2)) {
                return false;
            }
            boolean isOk = false;
            while (end <= l) {
                if (substr.equals(s.substring(begin, end))){
                    isOk = true;
                    if (end == l) {
                        return true;
                    }
                    begin = end;
                    end = begin + currLn;
                    if (end + 1 > l) {
                        p1 = begin;
                        isOk = false;
                    };

                } else {
                    isOk = false;
                    p1++;
                    break;
                }
            }
            if (isOk) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abac"));
        System.out.println(repeatedSubstringPattern("abab"));
        System.out.println(repeatedSubstringPattern("abcabcabcabc"));

    }
}
