package yellow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhoneLetterCombination {
    public static List<String> letterCombinations(String digits) {
        int n = digits.length();
        char[][] buttons = {
                {},
                {},
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'},
                {'j', 'k', 'l'},
                {'m', 'n', 'o'},
                {'p', 'q', 'r', 's'},
                {'t', 'u', 'v'},
                {'w', 'x', 'y', 'z'}
        };

        int[] array = Arrays.stream(digits.split("")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(array));

        List<String> first = new ArrayList<>();

        int indexOne = array[0];
        for (int j = 0; j < buttons[indexOne].length; j++) {
            String s = String.valueOf(buttons[indexOne][j]);
            first.add(s);
        }
        if (n < 2) {
            return first;
        }
        int indexTwo = array[1];
        List<String> second = makeNewList(buttons, first, indexTwo);
        if (n < 3) {
            return second;
        }
        int indexThree = array[2];
        List<String> third =  makeNewList(buttons, second, indexThree);
        if (n < 4) {
            return third;
        }
        int indexFour = array[3];
        return makeNewList(buttons, third, indexFour);
    }

    private static List<String> makeNewList(char[][] buttons, List<String> second, int indexThree) {
        List<String> third = new ArrayList<>();
        for (String old : second) {
            for (int i = 0; i < buttons[indexThree].length; i++) {
                String s = old + buttons[indexThree][i];
                third.add(s);
            }
        }
        return third;
    }

    public static void main(String[] args) {
        List<String> res = letterCombinations("2");
        System.out.print("Result  : ");
        res.forEach(s -> System.out.print(s + " - "));
    }
}
