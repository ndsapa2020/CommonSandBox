package green;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static int longestPalindromeFromLC(String s) {
        int odd = 0;
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Integer value : map.values()) {
            if (value % 2 != 0) {
                odd++;
            }
        }

        return odd > 0 ? n - odd + 1 : n;
    }

    public static int longestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int longest = 0;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int left = i;
            int size = 0;
            boolean isCentered = false;
            while (left < n) {
                char currLeft = arr[left];
                int right = findPairsIndex(arr, currLeft, left);
                if (right >= 0) {
                    left = right + 1;
                    size = size + 2;
                    if (size > longest) {
                        longest = size;
                    }
                } else {
                    if (!isCentered) {
                        isCentered = true;
                        left++;
                        size++;
                    } else {
                        left++;
                    }
                }
            }
        }

        if (longest < n && longest % 2 == 0) {
            longest++;
        }
        return longest;
    }

    private static int findPairsIndex(char[] arr, char ch, int except) {
        for (int i = except + 1; i < arr.length; i++) {
            if (arr[i] == ch) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "dabcdccc";
        str = "aBccccAA";
        System.out.println("The longest palindrome's length = " + longestPalindrome(str));
        System.out.println("From LeetCode = " + longestPalindromeFromLC(str));
    }
}
