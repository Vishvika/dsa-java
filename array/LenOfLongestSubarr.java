package array;

import java.util.HashMap;

public class LenOfLongestSubarr {
    static int lenOfLongestSubarr(int[] arr, int k){
        HashMap<Integer, Integer> mp = new HashMap<>();
        int res =0, prefixSum =0;

        for(int i = 0; i<arr.length; i++){
            prefixSum += arr[i];

            if(prefixSum == k){
                res = i+1;
            }
            if(mp.containsKey(prefixSum - k)){
                res = Math.max(res, i - mp.get(prefixSum - k));
            }
            mp.putIfAbsent(prefixSum, i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println(lenOfLongestSubarr(arr, k));
    }
}
