package green;

import java.util.Arrays;

public class ConstructRectangle {
    public static int[] constructRectangle(int area) {
        int sqrt = (int) Math.sqrt(area);
        int l = sqrt;
        int w = sqrt;
        while (l * w != area) {
            if (l * w > area) {
                w--;
            } else {
                l++;
            }
        }
        return new int[]{l, w};
    }

    public static int[] constructRectangleFromLC(int area) {
        int width = (int) Math.sqrt(area);
        while (area % width != 0) {
            width--;
        }
        return new int[]{area / width, width};
    }

    public static void main(String[] args) {
        int[] res = constructRectangle(1);
        System.out.println(Arrays.toString(res));
    }
}
