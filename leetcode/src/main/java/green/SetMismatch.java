package green;

import java.util.Arrays;

public class SetMismatch {
    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++){
            int value = nums[i] ;
            arr[value] = arr[value] + 1;
        }
        System.out.println(Arrays.toString(arr));
        int[] res = new int[2];
        for (int i = 1; i <= n; i++){
            if (arr[i] == 0) {
                res[1] = i;
            } else if (arr[i] > 1) {
                res[0] = i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findErrorNums(new int[]{3,2,3,4,6,5})));
    }
}
