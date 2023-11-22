package green;

import java.util.Arrays;

public class MaxProductThreeNums {
    public static int maximumProductFromLC(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3], nums[0] * nums[1] * nums[n - 1]);
    }

    public static int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int[] positives = Arrays.stream(nums)
                .filter(el -> el >= 0)
                .toArray();
        System.out.println(Arrays.toString(positives));
        int posL = positives.length;
        if (posL >= n - 1 || posL <= 1) {
            return nums[n - 1] * nums[n - 2] * nums[n - 3];
        }

        int[] negatives = Arrays.stream(nums)
                .filter(el -> el < 0)
                .toArray();
        System.out.println(Arrays.toString(negatives));

        int negProd = negatives[0] * negatives[1];
        int possLastEl = positives[posL - 1];
        int posProd = possLastEl;
        if (posL - 2 > 0) {
            posProd *= positives[posL - 2];
        }
        if (posL - 3 > 0) {
            posProd *= positives[posL - 3];
        }
        System.out.println(posProd);
        return Math.max((negProd * possLastEl), posProd);

    }

    public static void main(String[] args) {

        int[] arr = {-710, -107, -851, 657, -14, -859, 278, -182, -749, 718, -640, 127, -930, -462, 694, 969, 143, 309, 904, -651, 160, 451, -159, -316, 844, -60, 611, -169, -73, 721, -902, 338, -20, -890, -819, -644, 107, 404, 150, -219, 459, -324, -385, -118, -307, 993, 202, -147, 62, -94, -976, -329, 689, 870, 532, -686, 371, -850, -186, 87, 878, 989, -822, -350, -948, -412, 161, -88, -509, 836, -207, -60, 771, 516, -287, -366, -512, 509, 904, -459, 683, -563, -766, -837, -333, 93, 893, 303, 908, 532, -206, 990, 280, 826, -13, 115, -732, 525, -939, -78};
        int res = maximumProduct(arr);
        System.out.println("Result = " + res + " expected " + 972256230 + " diff = " + (972256230 - res));
        int res1 = maximumProductFromLC(arr);
        System.out.println("Result = " + res1 + " expected " + 972256230 + " diff = " + (972256230 - res1));

    }
}
