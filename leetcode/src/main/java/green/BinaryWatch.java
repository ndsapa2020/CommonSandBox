package green;

import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {
    public static List<String> readBinaryWatch(int turnedOn) {
        ArrayList<String> result = new ArrayList<>();
        for (int hour = 0; hour < 12; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                int hourBits = Integer.bitCount(hour);
                int minuteBits = Integer.bitCount(minute);
                if (hourBits + minuteBits == turnedOn) {
                    if (minute < 10) result.add(String.format("%d:0%d", hour, minute));
                    else result.add(String.format("%d:%d", hour, minute));
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> result = readBinaryWatch(9);
        result.forEach(System.out::println);
    }
}
