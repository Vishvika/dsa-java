package SlidingWindow;

public class MaxSubarrOfSizeK {
    static int maxSubarrayOfSizeK(int[] arr, int k){
        int maxSum = 0;
        int windowSum = 0;
        int windowStart = 0;
        for(int windowEnd=0; windowEnd < arr.length; windowEnd++){
            windowSum += arr[windowEnd];

            if(windowEnd >= k-1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(maxSubarrayOfSizeK(arr, k));

    }
}
