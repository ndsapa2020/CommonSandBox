package green;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LicenseKeyFormatting {
    public static String licenseKeyFormatting(String s, int k) {
        String[] arr = s.toUpperCase().split("-");

        String removedDash = arr[0]
                + Arrays.stream(arr).skip(1).reduce("", String::concat);

        List<String> list = new ArrayList<>();
        int j = removedDash.length() - k;
        while ( j >= 0) {
            list.add(removedDash.substring(j, j + k));
            j -= k;
        }
        if (j + k > 0) {
            list.add(removedDash.substring(0, k + j ));
        }
        StringBuilder sb = new StringBuilder();
        for (int i = list.size() - 1; i>= 0 ; i--) {
            sb.append(list.get(i));
            sb.append("-");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "5F3Z-2e-9-w";
        System.out.println(s);
        int k = 4;
        String res = licenseKeyFormatting(s, k);
        System.out.println(res);
        System.out.println("---------------");
        String f = "2-4A0r7-4k";
        System.out.println(licenseKeyFormatting(f, 4) + " expected - " + "24A0-R74K");

        System.out.println("---");
        System.out.println(licenseKeyFormatting("2-5g-3-J", 2) + " expected - " + "2-5G-3J");
    }
}
