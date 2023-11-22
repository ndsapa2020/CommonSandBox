package green;

import java.util.*;

public class ReshapeMatrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[] linear = Arrays.stream(mat)
                .flatMapToInt(Arrays::stream)
                .toArray();
        System.out.println(Arrays.toString(linear));
        int l = linear.length;
        int index = 0;
        int[][] res = new int[r][c];
        for (int row = 0; row < r; row++) {
            List<Integer> list = new ArrayList<>();
            for (int col = 0; col < c; col++) {
                if (index >= l) {
                    return mat;
                }
                list.add(linear[index]);
                index++;
            }
            res[row] = list.stream().mapToInt(i -> i).toArray();
        }

        return (index < l) ? mat : res;
    }

    public static void main(String[] args) {
//        int[][] mat = {{1,2}, {3,4}};
        int[][] mat = {{1, 2}};
        int r = 1;
        int c = 1;
        int[][] result = matrixReshape(mat, r, c);
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));

        }

        Map<String, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int arrLength = 0;
        String[] res = map.keySet().stream()
                .filter(key -> map.get(key) == min)
                .map(String::new)
                .toArray(String[]::new);
        int index = 0;
        for (String key : map.keySet()) {
            if (map.get(key) == min) {
                res[index] = key;
                index++;
            }
        }


    }
}
