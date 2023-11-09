package green;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddStringNumsTest {

    @Test
    void addStrings() {
        String num1 = "11";
        String num2= "123";
        String expected = "134";

        AddStringNums addStringNums = new AddStringNums();
        String actual = addStringNums.addStrings(num1, num2);
        String actualLc = addStringNums.addStringsFromLC(num1, num2);

        assertEquals(expected, actual, num1 + " + " + num2 + " must be " + expected);
        assertEquals(expected, actualLc, num1 + " + " + num2 + " must be " + expected);
    }
    @Test
    void addStringsTwo() {
        String num1 = "456";
        String num2= "77";
        String expected = "533";

        AddStringNums addStringNums = new AddStringNums();
        String actual = addStringNums.addStrings(num1, num2);
        String actualLc = addStringNums.addStringsFromLC(num1, num2);

        assertEquals(expected, actual, num1 + " + " + num2 + " must be " + expected);
        assertEquals(expected, actualLc, num1 + " + " + num2 + " must be " + expected);
    }
    @Test
    void addStringsTwoZeros() {
        String num1 = "0";
        String num2= "0";
        String expected = "0";

        AddStringNums addStringNums = new AddStringNums();
        String actual = addStringNums.addStrings(num1, num2);
        String actualLc = addStringNums.addStringsFromLC(num1, num2);

        assertEquals(expected, actual, num1 + " + " + num2 + " must be " + expected);
        assertEquals(expected, actualLc, num1 + " + " + num2 + " must be " + expected);
    }
    @Test
    void addStringsOneAndTwo() {
        String num1 = "1";
        String num2= "9";
        String expected = "10";

        AddStringNums addStringNums = new AddStringNums();
        String actual = addStringNums.addStrings(num1, num2);
        String actualLc = addStringNums.addStringsFromLC(num1, num2);

        assertEquals(expected, actual, num1 + " + " + num2 + " must be " + expected);
        assertEquals(expected, actualLc, num1 + " + " + num2 + " must be " + expected);
    }

}