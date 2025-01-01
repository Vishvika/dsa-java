package array;

import java.util.HashMap;

public class TwoSum {
    static int[] twoSum(int[] arr, int target){
        HashMap<Integer, Integer> mp = new HashMap<>();
        int[] res = new int[2];
        for(int i=0; i< arr.length; i++){
            mp.put(arr[i], i);
        }

        for(int i=0; i< arr.length; i++){
            int comp = target - arr[i];
            if(mp.containsKey(comp) && mp.get(comp) != i){
                res[0] = i;
                res[1] = mp.get(comp);
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int[] ans = twoSum(arr, 14);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
