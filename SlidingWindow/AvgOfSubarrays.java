package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class AvgOfSubarrays {
    static List<Double> avgOfSubarrays(int[] arr, int k){
        List<Double> results = new ArrayList<>();
        double windowSum = 0;
        int windowStart = 0;

        for(int windowEnd = 0; windowEnd < arr.length; windowEnd++){
            windowSum += arr[windowEnd];
            if(windowEnd >= k-1){
                results.add(windowSum/k);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return results;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        List<Double> avgs = avgOfSubarrays(arr, 5);
        System.out.println(avgs);
    }
}


