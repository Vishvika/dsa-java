package SlidingWindow;

public class SmallestSubarrWithSumK {
    static int smallestSubarrWithSumK(int[] arr, int k){
        int minLength = Integer.MAX_VALUE;
        int windowStart = 0;
        int windowSum = 0;
        for(int windowEnd=0; windowEnd < arr.length; windowEnd++){
            windowSum += arr[windowEnd];

            while(windowSum >= k){
                minLength = Math.min(minLength, windowEnd - windowStart+1);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        if(minLength == Integer.MAX_VALUE){ return 0;}
        return minLength;
    }

    public static void main(String[] args) {
        int[] arr= {2, 1, 5, 2, 3, 2, 1};
        System.out.println(smallestSubarrWithSumK(arr, 9));

    }
}
