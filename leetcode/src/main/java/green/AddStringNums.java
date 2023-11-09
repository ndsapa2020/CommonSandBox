package green;

public class AddStringNums {
    public String addStringsFromLC(String num1, String num2) {
        StringBuilder str = new StringBuilder();

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        int sum;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? num1.charAt(i--) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j--) - '0' : 0;

            sum = digit1 + digit2 + carry;
            str.append(sum % 10);
            carry = sum / 10;
        }

        return str.reverse().toString();
    }

    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        String[] arr1 = num1.split("");
        String[] arr2 = num2.split("");
        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;
        int rem = 0;
        while (p1 >= 0 && p2 >= 0) {
            int d1 = Integer.parseInt(arr1[p1]);
            int d2 = Integer.parseInt(arr2[p2]);
            int currSum = d1 + d2 + rem;
            rem = addCurrentSum(sb, currSum);
            p1--;
            p2--;
        }
        while (p1 >= 0) {
            int d = Integer.parseInt(arr1[p1]);
            int currSum = d + rem;
            rem = addCurrentSum(sb, currSum);
            p1--;
        }

        while (p2 >= 0) {
            int d = Integer.parseInt(arr2[p2]);
            int currSum = d + rem;
            rem = addCurrentSum(sb, currSum);
            p2--;
        }
        if (rem == 1) {
            sb.append(1);
        }
        return sb.reverse().toString();
    }

    private int addCurrentSum(StringBuilder sb, int currSum) {
        int digitToAdd;
        int rem = 0;
        if (currSum > 9) {
            digitToAdd = currSum - 10;
            rem = 1;
        } else {
            digitToAdd = currSum;
        }
        sb.append(digitToAdd);
        return rem;
    }

    public static void main(String[] args) {

    }
}
