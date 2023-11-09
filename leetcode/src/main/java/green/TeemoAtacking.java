package green;

public class TeemoAtacking {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int n = timeSeries.length;
        int neg = 0;
        for (int i = 0; i < n - 1; i++) {
            int diff = timeSeries[i + 1] - timeSeries[i];
            if (diff < duration) {
                neg += duration -(diff);
            }
        }
        System.out.println("n*duration = " + (n * duration) + " neg = " + neg);
        return n * duration - neg;
    }
    public static void main(String[] args) {
        int[] timeSeries = {1,2,3,4,5,6,7,8,9};
        int duration = 10;
//        int[] timeSeries = {1, 4};
//        int duration = 2;
        System.out.println("Result = " + findPoisonedDuration(timeSeries, duration));
    }
}
