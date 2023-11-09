package green;

public class IslandPerimeter {
    public static int islandPerimeter(int[][] grid) {
        int result = 0;
        int sizeV = grid[0].length;
        int sizeH = grid.length;
        System.out.println(sizeH + " " + sizeV);
        for (int i = 0; i < sizeH; i++) {
            for (int j = 0; j < sizeV; j++) {
                if (grid[i][j] == 1) {
                    result += 4;
                    if (((i - 1) >= 0) && (grid[i - 1][j] == 1)) {
                        result--;
                    }
                    if (((j - 1) >= 0) && (grid[i][j - 1] == 1)) {
                        result--;
                    }
                    if (((i + 1) < sizeH) && (grid[i + 1][j] == 1)) {
                        result--;
                    }
                    if (((j + 1) < sizeV) && (grid[i][j + 1] == 1)) {
                        result--;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
//        int[][] grid = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        int[][] grid = {{0, 1}};

        int r = islandPerimeter(grid);
        System.out.println("Perimeter = " + r);
    }
}
